/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月19日 下午10:13:19
* 类说明:  easy
*/
public class leetcode686_Repeated_strin_match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("abcabc".contains("abc"));
	}

	public static int repeatedStringMatch(String A, String B) {
//        B.contains(A);
		int count = 0;
		StringBuilder stringBuilder = new StringBuilder();
		while (stringBuilder.length() < B.length()){
			stringBuilder.append(A);
			count++;
		}
		if (stringBuilder.toString().contains(B)){
			return count;
		}
		if (stringBuilder.append(A).toString().contains(B)){
			count++;
			return count;
		}
		
        
		return -1;
    }
}
