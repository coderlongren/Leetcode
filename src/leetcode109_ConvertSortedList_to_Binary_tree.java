import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��17�� ����10:55:04
* ��˵��: 
*/
public class leetcode109_ConvertSortedList_to_Binary_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode head = new ListNode(-10);
		head.next = new ListNode(-3);
		head.next.next = new ListNode(0);
		head.next.next.next = new ListNode(5);
		head.next.next.next.next = new ListNode(9);
		head.next.next.next.next.next = new ListNode(10);
		System.out.println(sortedListToBST(head)   .val);
		
	}
	public static TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
        	return null;
        }
        if (head.next == null) {
        	return new TreeNode(head.val);
        }
        ListNode left = getLeftNodeFromList(head);
        ListNode mid = left.next;
        TreeNode root = new TreeNode(mid.val);
        left.next = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);
        return root;
        
    }
	// ����� Ѱ��left�ڵ㣬���ɵĵط�����ʹ�ÿ���ָ�룬 
	public static ListNode getLeftNodeFromList(ListNode head) {
		ListNode next = head;
		ListNode pre = head;
		while (next != null) {
			next = next.next;
			if (next == null) {
				break;
			}
			next = next.next;
			if (next == null) {
				break;
			}
			pre = head;
			head = head.next;
		}
		return pre;
		
	}

}
