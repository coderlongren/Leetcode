
public class leetcode206_Reverse_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static ListNode reverseList(ListNode head) {
        
    	ListNode prev = null; // 前一个节点 默认为null
    	ListNode cur = head; // 当前节点
    	while (cur != null){
    		ListNode next = cur.next;// 保存我下下个节点的地址 即hashCode
    		cur.next = prev;
    		prev = cur;// 
    		cur = next;
    		
    	}
    	return prev;
    }

}
