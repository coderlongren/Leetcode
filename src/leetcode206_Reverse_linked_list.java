
public class leetcode206_Reverse_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static ListNode reverseList(ListNode head) {
        
    	ListNode prev = null; // ǰһ���ڵ� Ĭ��Ϊnull
    	ListNode cur = head; // ��ǰ�ڵ�
    	while (cur != null){
    		ListNode next = cur.next;// ���������¸��ڵ�ĵ�ַ ��hashCode
    		cur.next = prev;
    		prev = cur;// 
    		cur = next;
    		
    	}
    	return prev;
    }

}
