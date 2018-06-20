import java.awt.dnd.MouseDragGestureRecognizer;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��5��18�� ����12:32:50
* ��˵��: 
*/
public class leetcode148_sort_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(4);
		head.next = new ListNode(2);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(3);
		head = sortList(head);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	// ������� O(nlog n) ʱ�������������� 
	// ���ſ϶������ˣ��O(n^2) �ϲ������������ǵ�Ҫ��
	public static ListNode sortList(ListNode head) {
		if (head == null) {
			return head;
		}
		if (head.next == null) {
			return head;
		}
		// �����ÿ���ָ��ķ��������������middle
		ListNode pre = head;
		ListNode p1 = head;
		ListNode p2 = head;
		while (p2 != null && p2.next != null) {
			pre = p1;
			p1 = p1.next;
			p2 = p2.next.next;
		}
		
		pre.next = null; //�ض�������Ϊ������subList head , p1
		ListNode h1 = sortList(head);
		ListNode h2 = sortList(p1);
		return merge(h1, h2);
	}
	public static ListNode merge(ListNode p1, ListNode p2) {
		if (p1 == null) {
			return p2;
		}
		if (p2 == null) {
			return p1;
		}
		if (p1.val < p2.val) {
			p1.next = merge(p1.next, p2);
			return p1;
		}
		else {
			p2.next = merge(p1, p2.next);
			return p2;
		}
	}

}
