package leetcodeContest67;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月14日 上午10:37:54
* 类说明: 
*/
public class leetcode762_Prime_number_of_set_Bits_in_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPrimeSetBits(10, 15));
	}
	public static int countPrimeSetBits(int L, int R) {
		int count  = 0;
        for (int i = L; i <= R; i++){
        	String string = Integer.toBinaryString(i);
        	int bitNmuber = countBits(string);
        	if (setNumber(bitNmuber)){
        		count++;
        	}
        }
        return count;
    }
	public static int countBits(String string){
		int res = 0;
		for (Character character : string.toCharArray()){
			if (character == '1'){
				res++;
			}
		}
		return res;
	}
	public static boolean setNumber(int n){
		if (n == 0 || n == 1){
			return false;
		}
		for (int i = 2; i < n ;i++){
			if (n%i == 0){
				return false;
			}
		}
		return true;
	}

}
