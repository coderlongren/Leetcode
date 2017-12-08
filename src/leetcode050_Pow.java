
public class leetcode050_Pow {

	public static void main(String[] args) {
		System.out.println(Math.pow(2.0000, 3));
		System.out.println();
	}
	public static double myPow(double x, int n) {
        
		if (n == 0){
			return 1;
		}
		if (x == 1){
			return 1;
		}
		if (n == 1){
			return x;
		}
		else{
			if (n < 0){
				x = 1/x;
				n = -n;
			}
			
			return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);	
		}
		
		
		
//		double res = 1.0;
//		for (int i = 0; i < n; i++){
//			res *= x;
//		}
//		return res;
		
    }
	double myPow2(double x,int n){
		if (n == 0){
			return 1;
		}
		if (n < 0){
			x = x/1;
			n = -n;
		}
		return n%2 == 0? myPow2(x*x, n/2):x*myPow2(x*x, n/2);
	}

}
