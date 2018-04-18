import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月17日 上午10:55:04
* 类说明: 
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
	// 这里的 寻找left节点，精巧的地方就是使用快慢指针， 
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
