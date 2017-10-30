
public class leetcode019_Remove_Nth_Node_From_End_Of_List {

	/**
	 * Remove the Nth node from the given List 
	 * 
	 */
	public static void main(String[] args) {
		//test program
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = null;
		ListNode test = Remove_Nth_Node_From_End_Of_List(head, 2);
		System.out.println(test.val);
	}
	public static ListNode Remove_Nth_Node_From_End_Of_List(ListNode head,int n){
		if (head == null || head.next == null){
			return null;
		}
		ListNode first = head;
		ListNode second = head;
		//从前往后数 same 从后向前数 n
		for (int i = 0; i < n;i++){
			first = first.next;
			if (first == null){
				return head.next;
			}
		}
		while (first.next != null){
			first = first.next;
			//second已经指到 倒数 n+1个节点
			second = second.next;
		}
		second.next = second.next.next;
		return head;
	}
	//given the listNode
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int val){
			this.val = val;
		}
	}

}
