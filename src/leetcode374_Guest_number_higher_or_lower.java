/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月22日 下午10:55:18
* 类说明: 
*/
public class leetcode374_Guest_number_higher_or_lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int guessNumber(int n) {
		 
		 int left = 1;
		 int right = n;
		 
		 while (left < right){
			 int mid = left + (right - left)/2;
			 if (guess(mid) == 0){
				 return mid;
			 }
			 else if (guess(mid) == 1){
				 left = mid + 1;
			 }
			 else {
				 right = mid - 1;
			 }
		 }
		 
		 
	 }
	private int guess(int mid) {
		// TODO Auto-generated method stub
		return 0;
	}
}
