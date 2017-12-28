/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月28日 下午11:02:50
* 类说明: 
*/
public class leetcode476_Number_Complement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findComplement(2460067157));
	}
	public static int findComplement(int num) {
        String string1 = Integer.toBinaryString(Integer.valueOf(num + "",10));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string1.length(); i++){
        	if (string1.charAt(i) == '0'){
        		stringBuilder.append('1');
        	}
        	else {
        		stringBuilder.append('0');
        	}
        }
        String result = Integer.toOctalString(Integer.valueOf(stringBuilder.toString(),2));
        
		return Integer.valueOf(result,10);
    }

}
