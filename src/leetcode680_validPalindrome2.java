/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月17日 下午8:31:11
* 类说明: 
*/
public class leetcode680_validPalindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		System.out.println(validPalindrome(s));
	}
	// 我们通过从两边往 中间进行比较， 如果遇到了不等的情况， 就记录下当前的 i,j 分别略过 i,j进行比较，如果还不能相等，就返回false
	 public static boolean validPalindrome(String s) {
		 int i;
		 int j;
		 int tempI = 0;
		 int tempJ = 0;
		 int count = 0;
		 for (i = 0,j = s.length() - 1; i < j; i++,j--){
			 if (s.charAt(i) == s.charAt(j)){
				 ;
			 }
			 
			 // 第一次遇到了不同
			 else if (count == 0){
				 count++;
				 tempI = i;
				 tempJ = j;
				 i--; // 这里就相当于， i 不变，把j省略了，进行比较 
			 }
			 // count== 1 说明 这里是第二次遇到不同
			 else if (count == 1){
				 count++;
				 i = tempI;
				 j = tempJ;
				 j++;
			 }
			 else {
				 return false;
			 }
		 }
		 return true;
	 }

}
