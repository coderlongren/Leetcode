import java.util.HashSet;
import java.util.Set;

public class leetcode202_Happy_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<Integer> set = new HashSet<Integer>();
	       System.out.println( set.add(1));
	       System.out.println(set.add(1));
	       System.out.println(set.add(3));
	       System.out.println(count(12));
	}
	public static boolean isHappy(int n) {

        Set<Integer> set = new HashSet<Integer>();
        while (set.add(n)){
        	n = count(n);
        	if (n == 1){
        		return true;
        	}
        }
        return false;
    }
	public static int count (int n){
		int temp = n;
		int sum = 0;
		while (temp != 0){
			int i = temp%10;
			sum += i*i;
			temp /= 10;
		}
		return sum;
	}
}
