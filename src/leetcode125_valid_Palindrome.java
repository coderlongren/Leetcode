import lanqiao.org.shiliuToShi;

public class leetcode125_valid_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String string = "A. cS";
//		string = string.toLowerCase();
//		System.out.println(string);
//		String string = "A man, a plan, a canal: Panama";
		String string = ",.";
		System.out.println(isPalindrome(string));
		
	}
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
        char[] array = s.toCharArray();
        int head = 0;
        int tail = s.length() - 1;
        while (head <= tail){
//        	while ((array[head] < 'a' || array[head] > 'z') && head < s.length()){
//        		head++;
//        	}
//        	while((array[tail] < 'a' || array[tail] > 'z') && tail >= 0){
//        		tail--;
//        	}
//        	if (array[head] != array[tail]){
//        		return false;
//        	}
//        	head++;
//        	tail--;
        	//  this is key to the quetion how to judge whether the char is the number || character
        	if (!Character.isJavaLetterOrDigit(array[head])){
        		head++;
        	}
        	else if (!Character.isJavaLetterOrDigit(array[tail])){
        		tail--;
        	}
        	else {
        		if (array[head] != array[tail]){
        			return false;
        		}
        		head++;
        		tail--;
			}
        	
        	
        }
        
		return true;
		
    }

}
