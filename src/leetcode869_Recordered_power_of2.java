/**
* @author 作者 : coderlong
* @version 创建时间：2018年7月16日 上午11:18:42
* 类说明: 
*/
public class leetcode869_Recordered_power_of2 {
	public static void main(String[] args) {
		System.out.println(1 << 31);
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 31; i++) {
			builder.append("1");
		}
		System.out.println(Integer.valueOf(builder.toString(), 2) == Integer.MAX_VALUE);
	}
	public static boolean reorderedPowerOf2(int N) {
		int res = count(N);
        for (int i = 0; i < 32; i++) {
        	if (count(1 << i) == res) {
        		return true;
        	}
        }
        return false;
    }
	public static int count(int N) {
		int res = 0;
		while (N > 0) {
			res += Math.pow(10, N%10);
			N /= 10;
		}
		return res;
	}
}
