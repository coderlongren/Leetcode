package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月14日 上午11:51:01
* 类说明:  合并两个已经是有序的链表
*/
public class 合并链表 {

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
		// 注意这里的递归限度就行了。
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
