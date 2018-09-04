import java.util.List;
import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月28日 下午7:56:59
* 类说明: 
*/
public class hao3 {
	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head = reverse(head);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	public static ListNode reverse(ListNode head) {
		if (head.next == null) {
			return head;
		}
		ListNode preHead = reverse(head.next);
		head.next = null;
		preHead.next = head;
		return preHead;
	}
}

