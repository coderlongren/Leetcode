
public class leetcode160_Intersection_of_two_linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		
		ListNode nodeA = headA;
		ListNode nodeB = headB;		
		int lenA = len(headA);
		int lenB = len(headB);
		
		
		while (lenA > lenB){
			nodeA = nodeA.next;
			lenA--;
		}
		while (lenA < lenB){
			nodeB = nodeB.next;
			lenB--;
		}
		while (nodeA != null){
			if (nodeA.val == nodeB.val){
				return nodeA;
			}
			else {
				nodeA = nodeA.next;
				nodeB = nodeB.next;
			}
		}
		
		return null;
	 }
	public static int len(ListNode head){
		int len = 0;
		while (head != null){
			len++;
			head = head.next;
		}
		return len;
	}

	
}
