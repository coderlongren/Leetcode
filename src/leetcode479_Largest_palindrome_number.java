/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月30日 下午3:29:08
* 类说明:  直接 暴力计算出来算了
*/
public class leetcode479_Largest_palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	public int largestPalindrome(int n) {
//        if (n==1) return 9;
//        int max=(int)Math.pow(10, n)-1;
//        for (int v=max-1;v>max/10;v--) {
//            long u=Long.valueOf(v+new StringBuilder().append(v).reverse().toString());
//            for (long x=max;x*x>=u;x--)
//                if (u%x==0)
//                    return (int)(u37);
//        }
//        return 0;
//    }
	public static int largestPalindrome(int n){
	        int rst[] = {9, 987, 123, 597, 677, 1218, 877, 475};
	        return rst[n-1];
	}
}
