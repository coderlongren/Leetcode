package contest56week;

public class leetcode_LongSubarray {

	public static void main(String[] args) {
		int[] A = {2,3,56};
		int[] B = {0,5,45};
		System.out.println(findLength(A, B));
	}
	 public static int findLength(int[] A, int[] B) {
		 int len1 = A.length;
		 int len2 = B.length;
		 String a = "";
		 String b = "";
		 for (int i = 0; i < A.length;i++){
			 a +=A[i] + "";
		 }
		 for (int i = 0; i < B.length;i++){
			 b +=B[i] + "";
		 }
		 int maxlen = 0;
		 if (len1 < len2){
			 for (int i = 0; i < a.length(); i++){
					 for (int j = i + 1; j < a.length(); j++){
						 if (b.contains(a.substring(i, j))){
							 if (maxlen < (j - i)){
								 maxlen = j - i;
							 }
						 }
				 }
			 }
		 }
		 else {
			 for (int i = 0; i < b.length() - 1; i++){
				 for (int j = i + 1; j <= b.length(); j++){
					 if (a.contains(b.substring(i, j))){
						 if (maxlen < (j - i)){
							 maxlen = j - i;
						 }
					 }
				 }
				 
			 }
		}
		 
		 return maxlen; 
	 }
	 public static boolean isSubarray(int[] test){
		return false;
		 
	 }
}
