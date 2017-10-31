
public class leetcode038_CountAndSay {

	/***
	 * The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string. 
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(4));

	}
    public static String countAndSay(int n) {
        
    	String init = "1";
    	for (int i = 1; i < n; i++){
    		init = countandsay(init);
    	}
    	return init;
    }
    public static String countandsay(String init){
    	
    	char[] chars = init.toCharArray();
    	char last = chars[0];
    	int count = 1;
    	String test = "";
    	for (int i = 1; i < init.length(); i++){
    		if (last == chars[i]){
    			count++;
    		}
    		else {
				test += "" + count + last;
				count = 1;
				last = chars[i];
			}
    	}
    	
    	test  += "" + count + last;
    	
    	return test;
    }

}
