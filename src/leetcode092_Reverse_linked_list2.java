
public class leetcode092_Reverse_linked_list2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode newHead = reverseBetween(head, 3, 5);
		while (newHead != null){
			System.out.println(newHead.val);
			newHead = newHead.next;
		}
		
	}
	public static ListNode reverseBetween(ListNode head, int m, int n) {
		
		
		if(head == null){
			 return null;
		}
		
	    ListNode dummy = new ListNode(0); // create a dummy node to mark the head of this list
	    dummy.next = head;
	    ListNode pre = dummy; // make a pointer pre as a marker for the node before reversing
	    
	    // 移动到第m - 1个 节点上 
	    for(int i = 0; i<m-1; i++) {
	    	pre = pre.next;
	    }
	    
	    
	    ListNode start = pre.next; // 开始节点
	    ListNode then = start.next; // 开始节点的下一个节点
	    
	    // 1 - 2 -3 - 4 - 5 ; m=2; n =4 ---> pre = 1, start = 2, then = 3
	    // dummy-> 1 -> 2 -> 3 -> 4 -> 5
	    
	    for(int i=0; i<n-m; i++)
	    {
	        start.next = then.next;
	        then.next = pre.next;
	        pre.next = then;
	        then = start.next;
	    }
	    
	    // first reversing : dummy->1 - 3 - 2 - 4 - 5; pre = 1, start = 2, then = 4
	    // second reversing: dummy->1 - 4 - 3 - 2 - 5; pre = 1, start = 2, then = 5 (finish)
	    
	    return dummy.next;
		
    }

}
