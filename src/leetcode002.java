

/*
 * 	You are g iven two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

	You may assume the two numbers do not contain any leading zero, except the number 0 itself.

	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
	Output: 7 -> 0 -> 8
	
	关键是采用  carry 来记录每次 相加之后的进位  如果 两个链表都为null && carry == 0 finished  else 。。。。。。。。
  */
public class leetcode002 {
	
}

//  Definition for singly-linked list.
class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
 }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	
    	if (l1 == null && l2 == null){
    		return null;
    	}
    	if (l1 == null){
    		return l2;
    	}
    	if (l2 == null){
    		return l1;
    	}
    	
    	ListNode p1 = l1;
    	ListNode p2 = l2;
    	ListNode head = new ListNode(0);
    	ListNode result = head;
    	
    	int carry = 0;
    	while (carry != 0 || p1 != null || p2 != null){
    		int v1 = 0;
    		if (p1 != null){
    			v1 = p1.val;
    			p1 = p1.next;
    		}
    		int v2 = 0;
    		if (p2 != null){
    			v2 = p2.val;
    			p2 = p2.next;
    		}
    		int sum = v1 + v2 + carry;
    		carry = sum/10;
    		result.next = new ListNode(sum%10);
    		result = result.next;
    		
    	}
    	
		return head.next;
        
    }
}
