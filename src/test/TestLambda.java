package test;
/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月20日 下午6:35:12
* 类说明: 
*/
public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread =  new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("running.....");
			}
		});
		thread.start();
		Thread thread2 = new Thread(() ->System.out.println("running"));
		thread2.run();
		
	}
	class mythread extends Thread{
		
	}

}
