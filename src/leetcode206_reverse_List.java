/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月13日 上午11:22:37
* 类说明:  递归的解法， 旋转链表
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
