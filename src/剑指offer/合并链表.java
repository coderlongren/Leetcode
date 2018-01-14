package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��14�� ����11:51:01
* ��˵��:  �ϲ������Ѿ������������
*/
public class �ϲ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(2);
		head1.next.next = new ListNode(4);
		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(3);
		head2.next.next = new ListNode(4);
		
		ListNode newHead =  mergeList(head1, head2);
		while (newHead != null){
			System.out.println(newHead.val);
			newHead = newHead.next;
		}
	}
	public static ListNode mergeList(ListNode head1,ListNode head2) {
		if (head1 == null){
			return head2;
		}
		else if (head2 == null){
			return head1;
		}
		
		ListNode newHead = null;
		// ע������ĵݹ��޶Ⱦ����ˡ�
		if (head1.val <= head2.val){
			newHead = head1;
			newHead.next = mergeList(head1.next, head2);
		}
		else {
			newHead = head2;
			newHead.next = mergeList(head1, head2.next);
		}
		
		return newHead;  
		
	}

}
