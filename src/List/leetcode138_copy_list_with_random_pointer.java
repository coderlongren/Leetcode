package List;

import java.util.HashMap;
import java.util.Map;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��1�� ����11:05:47
* ��˵��:  ��Ȼ���ԣ����Լ����Ե���ͨ����
*/
public class leetcode138_copy_list_with_random_pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public RandomListNode copyRandomList(RandomListNode head) {
		 if (head == null){
			 return null;
		 }
		 // ��Ȼ����ȿ������Ͳ�������ԭ���������� 
		 RandomListNode newHead = new RandomListNode(head.label);
		 RandomListNode oldHead = head.next;
		 RandomListNode newList = newHead;
		 Map<RandomListNode,RandomListNode> map = new HashMap<>();
		 map.put(newHead,head);
		 // ��ȿ���
		 while (oldHead != null){
			 RandomListNode tem = new RandomListNode(oldHead.label);
			 newList.next = tem;
			 map.put(tem, oldHead);
			 oldHead = oldHead.next;
			 newList = newList.next;
		 }
		 
		 
		 // ���ָ�� ��ֵ
		 newList = newHead; // ����ָ�� �µ�����ͷ�ڵ�
		 oldHead = head;
		 while (newList != null) {
			 newList.random = map.get(newList).random;
			 newList = newList.next;
			 oldHead = oldHead.next;
		}
		return newHead;
	        
	 }

}
