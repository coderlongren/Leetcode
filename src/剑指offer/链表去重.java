package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��11�� ����1:11:45
* ��˵��: 
*/
public class ����ȥ�� {
	public static void main(String[] args) {
		ListNode head = new ListNode(2);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(4);
		ListNode newHead = quchong(head);
		while (newHead != null) {
			System.out.println(newHead.val);
			newHead = newHead.next;
		}
	}
	public static ListNode quchong(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = new ListNode(Integer.MAX_VALUE);
		pre.next = head;
		ListNode p =  head;
		ListNode q = pre;
		while (p != null) {
			while (p.next != null && p.next.val == p.val) {
				p = p.next;
			}
			if (q.next != p) {
				q.next = p;
				q = q.next;
				p = p.next;
			}
			else {
				q.next = p;
				q = q.next;
				p = p.next;
			}
		}
		return pre.next;
	}
}
