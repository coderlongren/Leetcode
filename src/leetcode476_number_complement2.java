/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月29日 下午7:28:08
* 类说明: 
*/
public class leetcode476_number_complement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(45&1);
//		System.out.println(findComplement(5));
		System.out.println(5&(1<<2));
		System.out.println(findComplement(5));
		
	}
	public static int findComplement(int num) {
		// get the first 1bit
		int i = 31;
		Boolean flag = false;
		while (i >= 0){
			if ((num &(1<<i)) > 0){
				flag = true;
			}
			if (flag){
				num = num^(1<<i);
			}
			i--;
		}
		return num;
	}

}
