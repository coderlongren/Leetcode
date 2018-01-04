/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月4日 下午10:11:32
* 类说明:  第一次提交时  超时了，所以还是
*/
public class leetcode507_Perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPerfectNumber(28));
		System.out.println(Math.sqrt(4));
	}
	public static boolean checkPerfectNumber(int num) {
        if (num == 1){
        	return false;
        }
        int sum = 0;
        for (int i = 2; i <= Math.sqrt(num); i++){
        	// 为了避免超时， 遍历到sqrt(num)就行了
        	if (num%i == 0){
        		sum += i;
        		if (i != num/i){
        			sum += num/i;
        		}
        	}
        }
        sum++;
        if (sum == num){
        	return true;
        }
        else {
        	return false;
        }
		
    }

}
