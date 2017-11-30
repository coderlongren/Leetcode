import java.util.HashSet;
import java.util.Set;

public class leetcode141_linked_List_Cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static boolean hasCycle(ListNode head) {
		 if (head == null){
			 return false;
		 }
		 Set<ListNode> set = new HashSet<ListNode>();
		 while (head.next != null){
			 if (!set.contains(head)){
				 set.add(head);
				 head = head.next;
			 }
			 else{
				 return true;
			 }
		 }
		 return false;
	 }
}
