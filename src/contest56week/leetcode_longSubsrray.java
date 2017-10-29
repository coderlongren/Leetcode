package contest56week;

public class leetcode_longSubsrray {

	public static void main(String[] args) {
		int[] A = {0};
		int[] B = {0};
		System.out.println(isSubarray(A, B));
	}
	 public static int findLength(int[] A, int[] B) {
		 int len1 = A.length;
		 int len2 = B.length;
		 int maxlen = 0;
		 if (len1 < len2){
			 for (int i = 0; i < A.length; i++){
				 int j = i + 1;
				 //具体就是 构建许多个 i~j的数组 依次去和大数组比较 取最大的子数组 
				 //不实现了，因为 saw the DP solution  
			 }
		 }
		 for (int i = 0; i < A.length; i++){
			 //同上
		 }
		 
		 return maxlen; 
	 }
	 public static boolean isSubarray(int[] a, int[] b){
		 boolean test = false;
		 for (int i = 0; i < a.length; i++){
			 if (a[i] == b[0]){
				 boolean flag = true;
				 int k = i + 1;
				 for (int j = 1;j < b.length; j++){
					if (a[k] != b[j]){
						flag = false;	
					} 
				 }
				 test = flag;
			 }
			 if (test){
				 return true;
			 }
		 }
		 
		return false;
		 
	 }

}
