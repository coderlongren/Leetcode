/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��13�� ����11:22:37
* ��˵��:  �ݹ�Ľⷨ�� ��ת����
*/
public class leetcode206_reverse_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static ListNode reverseList(ListNode head) {
		 if (head == null || head.next == null){
			 return head;
		 }
		 ListNode next = head.next;
		 ListNode newHead = reverseList(next);
		 next.next = head;
		 head.next = null;
		 return newHead;
	 }

}
