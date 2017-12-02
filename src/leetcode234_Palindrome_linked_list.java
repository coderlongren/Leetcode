
public class leetcode234_Palindrome_linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static boolean isPalindrome(ListNode head) {
//        int len = 0;
//        ListNode node = head;
//        while (node != null){
//        	len++;
//        	node = node.next;
//        }
////        int center = 0;
//        if (len == 1){
//        	return true;
//        }
//        if (len%2 == 1){
//        	int left = len/2  - 1;
//        	int right = len/2 + 1;
//        	
//        }
//        else {
//        	int left = len/2 - 1;
//        	int right = len/2;
//        }
    	StringBuilder stringBuilder = new StringBuilder();
    	while (head != null){
    		stringBuilder.append(head.val);
    		head = head.next;
    	}
    	
    	
    	System.out.println(stringBuilder.toString());
		return false;
        
        
        
    	
    }
    public static boolean palindrome(ListNode head,int left,int right,int len){
    	while (left >= 0 && right < len){
    		
    	}
    	return false;
    }

}
