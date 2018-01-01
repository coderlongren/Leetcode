package leetcodeContest65;
/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月31日 上午10:34:30
* 类说明: 
*/
public class leetcode754_Reach_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reachNumber(3));
	}
	public static int reachNumber(int target) {
        return move(target, 0, 1, 0);
    }
	public static int move(int target,int start,int len,int count){
		if (target == start){
			return count;
		}
		else {
			return move(target, start + len, len + 1, count + 1) | move(target, start - len, len + 1, count + 1);
		}
	
	}
	

}
