
public class leetcode237DeleteNodeinalinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void deleteNode(ListNode node) {
		node.val=node.next.val;
	    node.next=node.next.next;
    }
}
