package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��13�� ����11:11:53
* ��˵��: 
*/
public class ��ת��ӡ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		ListNode newhead = reverseList(head);
		while (newhead != null) {
			System.out.println(newhead.val);
			newhead = newhead.next;
		}
	}
	public static ListNode reverseList(ListNode head) {
		if (head.next == null) {
			return head;
		}
		ListNode newHead = reverseList(head.next);
		// �������ÿһ���ڵ� ����
		head.next.next = head;
		// �ѵ�ǰ�ڵ��next�ÿ�
		head.next = null;
		return newHead;
	}

}
