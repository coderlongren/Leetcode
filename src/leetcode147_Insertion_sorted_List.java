/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��9��2�� ����10:40:51
* ��˵��: 
*/
public class leetcode147_Insertion_sorted_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
    public ListNode insertionSortList(ListNode head) {
    	if (head == null || head.next == null) {
    		return head;
    	}
    	ListNode pre = new ListNode(0);
    	pre.next = head;
    	ListNode cur = head;
    	while (cur.next != null) {
    		ListNode next = cur.next;
    		if (cur.val <= next.val) {
    			cur = next;
    		}
    		else {
    			ListNode pos = findNodeLessNode(pre, next);
    			cur.next = next.next; // ������ڵ�ɾ��
    			next.next = pos.next;
    			pos.next = next;
    		}
    	}
    	return pre.next;
    }
    public ListNode findNodeLessNode(ListNode pre, ListNode node) {
    	while (pre.next.val <= node.val) {
    		pre = pre.next;
    	}
    	return pre;
    }
	

}
