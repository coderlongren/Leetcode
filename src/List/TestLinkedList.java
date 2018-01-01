package List;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月1日 上午10:56:53
* 类说明: 
*/
public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(0);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		
		ListNode temp = head;
		System.out.println(head +""+ head.next);
		System.out.println(temp + "" + temp.next);
		temp.next = new ListNode(200);
//		temp = temp.next;
//		System.out.println(temp.val);
//		System.out.println(head.val);
//		
		System.out.println(head.next.val);
	}

}
