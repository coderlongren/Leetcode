import 剑指offer.ListNode;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月4日 下午2:50:47
* 类说明: 
*/
public class leetcode061_rotate_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(0);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
		rotateRight(head, 4);
	}
	public static ListNode rotateRight(ListNode head, int k) {
		int len = 0;
		ListNode temp = head;
		if (temp == null) {
			return head;
		}
		while (temp != null) {
			len++;
			temp = temp.next;
		}
		temp = head;
		ListNode tail = null;
		while (temp != null) {
			if (temp.next == null) {
				tail = temp;
				temp.next = head;
				break;
			}
			temp = temp.next;
		}
		temp = head;
		ListNode pre = tail;
		if (k <= len) {
			k = len - k;
		}
		else {
			k = len - k%len;
		}
		
		for (int i = 0; i < k; i++) {
			pre = temp;
			temp = temp.next;
		}
		pre.next = null;
		
		return temp;
		
		
		
    }

}
