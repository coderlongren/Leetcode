package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月13日 上午11:11:53
* 类说明: 
*/
public class 反转打印链表 {

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
		if (head.next == null) { // 只有一个节点，不需要反转
			return head;
		}
		ListNode pPre = null;
		ListNode p = head;
		ListNode pNext = head.next;
		ListNode newHead = null;
		// 就是节点 顺序变换的问题, 注意细节问题
		while (p != null) {
			pNext = p.next;
			if (pNext == null) { // 到了最后一个节点了
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
		// 将后面的每一个节点 反向
		head.next.next = head;
		// 把当前节点的next置空
		head.next = null;
		return newHead;
	}

}
