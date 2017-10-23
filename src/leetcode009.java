
public class leetcode009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(1221));
	}
    public static boolean isPalindrome(int x) {
    	if (x < 0){
    		return false;
    	}
    	else if (x >=0 && x < 10){
    		return true;
    	}
    	
    	int d = 1;
    	while (x /d >= 10){
    		d*=10;
    	}
    	//最后得到 d 是x的最大为数 x=1221 d = 1000
    	
    	while (x != 0) {
    		if (x %10 != x /d){
    			return false;
    		}
    		x = x % d /10;
			d = d/100;
		}
    	
    	
		return true;
        
    }
    public static boolean isPalindrome1(int x) {
    	   if (x < 0 || (x != 0 && x%10 == 0)){
       		return false;
       	}
       	int d = 0;
       	while (x > d){
       		d = d*10 + x %10;
       		x = x/10;
       	}
       	return ((x == d) || (x == d/10));
      }
 

}
