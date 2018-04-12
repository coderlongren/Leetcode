package 多线程;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月9日 下午10:30:51
* 类说明:  使用Condition实现的生产者消费者模式
*/
public class ConditionTest {
	private LinkedList<String> buffer;    //容器
    private int maxSize ;           //容器最大
    private Lock lock;
    private Condition fullCondition;
    private Condition notFullCondition;
    
    

	public ConditionTest( int maxSize) {
		super();
		this.buffer = new LinkedList<>();
		this.maxSize = maxSize;
		this.lock = new ReentrantLock();
		this.fullCondition = lock.newCondition();
		this.notFullCondition = lock.newCondition();
	}
	// 生产操作
	public void set(String string) throws InterruptedException {
		lock.lock();
		try {
			while (maxSize == buffer.size()){
				notFullCondition.await(); // 慢了
			}	
			System.out.println("set" + string);
			buffer.add(string);
			fullCondition.signal();
		}
		finally {
			lock.unlock();
		}
	}
	
	// 消费
	public String get() throws InterruptedException {
		String string;
		lock.lock();
		try {
			while (buffer.size() == 0) {
				fullCondition.await(); // 
			}
			string = buffer.poll();
			notFullCondition.signal();
		} finally {
			lock.unlock();
		}
		return string;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConditionTest conditionTest = new ConditionTest(3);
		while (true) {
			for (int i = 0; i < 4; i++) {
				Thread setter = new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						try {
							conditionTest.set("abc");
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
				setter.start();
			}
			Thread getter = new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						
						System.out.println("get" + conditionTest.get());
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			getter.start();
		}
	}

}
