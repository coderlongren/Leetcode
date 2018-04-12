package 多线程;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月6日 下午10:53:36
* 类说明: 
*/
public class TestAQS {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AbstractQueuedSynchronizer aqs = 
		ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
//		ConditionObject
		
		CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
		
	}

}
