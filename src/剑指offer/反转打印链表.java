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
		ListNode newhead = reverseList2(head);
		while (newhead != null) {
			System.out.println(newhead.val);
			newhead = newhead.next;
		}
	}
	public static ListNode reverseList2(ListNode head) {
		if (head == null) { // 
			return null;
		}
		if (head.next == null) { // ֻ��һ���ڵ㣬����Ҫ��ת
			return head;
		}
		ListNode pPre = null;
		ListNode p = head;
		ListNode pNext = head.next;
		ListNode newHead = null;
		// ���ǽڵ� ˳��任������, ע��ϸ������
		while (p != null) {
			pNext = p.next;
			if (pNext == null) { // �������һ���ڵ���
				newHead = p;
			}
			p.next = pPre;
			pPre = p;
			p = pNext;
		}
		return newHead;
		
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
