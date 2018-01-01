package leetcodeContest65;
/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月31日 上午10:56:39
* 类说明: 
*/
public class leetcode754_reach_a_number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reachNumber(3));
	}
	 public static int reachNumber(int target) {
	     if (target == 0){
	    	 return 0;
	     }
	     return step(target, 0,0);
	 }
	 public static int step(int target,int start,int step){
		 if (target == start){
			 return step;
		 }
		 if (step > Math.abs(target)){
			 return step;
		 }
		 step++;
		 return Math.min(step(target, start + step, step), step(target, start - step, step));
	 }
}
