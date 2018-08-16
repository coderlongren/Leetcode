package ��ָoffer;

import java.util.HashMap;
import java.util.Map;


/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��6�� ����5:19:54
* ��˵��: 
*/
public class DeepCopy {
	public  RandomListNode Clone(RandomListNode pHead){
		if (pHead == null) {
			return null;
		}
		
		RandomListNode newHead = new RandomListNode(pHead.label);
		RandomListNode pre = pHead;
		RandomListNode newPre = newHead;
		Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
		map.put(pre, newPre); // ͷ���ȫ������
		
		// ��������next�ڵ�
		while (pre.next != null) {
			newPre.next = new RandomListNode(pre.next.label);
			pre = pre.next;
			newPre = newPre.next;
			map.put(pre, newPre);
		}
		
		// ��������random�ڵ�
		pre = pHead;
		newPre = newHead;
		
		while (pre != null) {
			newPre.random  = map.get(pre.random);
			newPre = newPre.next;
			pre = pre.next;
			
		}
		
		
		return newHead;
	}
}
