public class leetcode203_remove_linked_list_elements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// leetcode 第101道题目  很爽啊 
	 public static ListNode removeElements(ListNode head, int val) {
	       ListNode fakeHead = new ListNode(-1);
	       fakeHead.next = head;
	       ListNode cur = head;
	       ListNode pre = fakeHead;
	       
	       while (cur != null){
	    	   if (cur.val == val){
	    		   pre.next = cur.next;
	    	   }
	    	   else {
	    		   pre = pre.next;
	    	   }
	    	   cur = cur.next;
	       }
	       return fakeHead.next;
	 }

}
