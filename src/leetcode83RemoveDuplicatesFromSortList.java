
public class leetcode83RemoveDuplicatesFromSortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	} 
	public static  ListNode deleteDuplicates(ListNode head) {
		ListNode listNode = head;
		if (listNode == null){
			return null;
		}
		while (listNode != null){
			if (listNode.next != null){
				if(listNode.next.val == listNode.val){
					listNode.next = listNode.next.next;
				}
				else{
					listNode = listNode.next;
				}
				
			}
			else{
				break;
			}
		}
		
		
		return head;
        
    }

}
