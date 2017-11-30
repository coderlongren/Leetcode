
public class leetcode234_palindrome_linked_list_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static boolean isPalindrome(ListNode head) {
	 
		 ListNode fast = head,low = head;
		 while (fast != null && fast.next != null) {
			 low = low.next;
			 fast = fast.next.next;
		 }
		 // odd nodes condition
		 if (fast != null){
			 low = low.next;
		 }
		 fast = head;
		 low = reverse(low);
		 // 循环比较
		 while (low != null){
			 if (low.val != fast.val){
				 return false;
			 }
			 fast = fast.next;
			 low = low.next;
		 }
		 return true;
	 }
	 // 逆转 后半部分 
	private static ListNode reverse(ListNode head){
		// TODO Auto-generated method stub
		ListNode prev = null;
		
		while (head != null) {
	        ListNode next = head.next;
	        head.next = prev;
	        prev = head;
	        head = next;
	    }		
		return prev;
	}

}
