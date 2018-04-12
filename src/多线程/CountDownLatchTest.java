package 多线程;

import java.util.concurrent.CountDownLatch;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月10日 下午10:26:19
* 类说明: 
*/
public class CountDownLatchTest {
	private static CountDownLatch countDownLatch;
	
	static class Bossthread extends Thread {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("老板在等待，本次会议需要" + countDownLatch.getCount() + "位员工");
			try {
				countDownLatch.await();
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("所有员工到达，开始开会");
		}
	}
	//员工到达会议室
    static class EmpleoyeeThread  extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + "，到达会议室....");
            //员工到达会议室 count - 1
            countDownLatch.countDown();
        }
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countDownLatch = new CountDownLatch(5);
		new Bossthread().start();
		for (int i = 0; i < 5; i++) {
			new EmpleoyeeThread().start();
		}
	}

}
