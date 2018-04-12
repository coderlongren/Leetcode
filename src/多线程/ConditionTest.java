package ���߳�;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��9�� ����10:30:51
* ��˵��:  ʹ��Conditionʵ�ֵ�������������ģʽ
*/
public class ConditionTest {
	private LinkedList<String> buffer;    //����
    private int maxSize ;           //�������
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
	// ��������
	public void set(String string) throws InterruptedException {
		lock.lock();
		try {
			while (maxSize == buffer.size()){
				notFullCondition.await(); // ����
			}	
			System.out.println("set" + string);
			buffer.add(string);
			fullCondition.signal();
		}
		finally {
			lock.unlock();
		}
	}
	
	// ����
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
