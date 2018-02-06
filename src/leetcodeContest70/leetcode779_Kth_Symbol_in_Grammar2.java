package leetcodeContest70;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月6日 下午5:47:28
* 类说明:  如果 从底往上算，在string很大的时候，会MemberOutOf, 后来想到这个 K_th char
* 是 跟第几行是无关的，每一个K(偶数先转化为奇数)  都是上一行的(K/2 + 1)由此得出递归的解法
*/
public class leetcode779_Kth_Symbol_in_Grammar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(kthGrammar(4, 5));
	}
	public static int kthGrammar(int N, int K) {
		return search(N, K);
	}
	 public static int search(int N, int K) {
		 if (N == 1) {
			 return 0;
		 }
		 
		 if (K%2 == 1) {
			 return search(N - 1, K/2 + 1);
		 }
		 else {
			 if (search(N - 1, (K - 1)/2 + 1) == 0) {
				 return 1;
			 }
			 else {
				 return 0;
			 }
		 }
	 }

}
