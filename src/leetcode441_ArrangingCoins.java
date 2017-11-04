
public class leetcode441_ArrangingCoins {
/***
 * You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(arrangeCoins(6));
	}
	// The problem is basically asking the maximum length of consecutive numbers that has
	// the running sum lesser or equal to 'n' In other word find x satify the following condition
	//µäÐÍµÄ¶þ²æËÑË÷
	public static  int arrangeCoins(int n) {
	    int start = 0;
	    int end = n;
	    while (start <= end){
	    	int mid = (start + end)/2;
	    	if (0.5*mid*mid + 0.5*mid <= n){
	    		start = mid + 1;
	    	}
	    	else {
				end = mid - 1;
			}
	    }
		return start - 1;
    }

}
