public class leetcode024_Swap_Node_In_Pairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	public static ListNode swapWairs(ListNode head){
		
		if (head == null || head.next == null){
			return head;
		}
		
		ListNode fakehead = new ListNode(0);
		ListNode result = fakehead;
		fakehead.next = head;
		while (fakehead.next != null && fakehead.next.next != null){
			ListNode first = fakehead.next;
			ListNode second = fakehead.next.next;
			
			first.next = second.next;
			fakehead.next = second;
			second.next = first;
			
			fakehead = fakehead.next.next;
		}
		
		return result.next;
	}
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int val){
			this.val = val;
		}
	}
	
	

}
