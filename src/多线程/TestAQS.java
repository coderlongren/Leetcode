package ���߳�;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��6�� ����10:53:36
* ��˵��: 
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
