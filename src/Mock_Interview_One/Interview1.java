package Mock_Interview_One;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年2月6日 下午9:20:20
* 类说明: 
*/
public class Interview1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder stringBuilder = new StringBuilder("abs");
//		stringBuilder.reverse();
//		System.out.println(stringBuilder.toString());
		System.out.println(addBinary("101111", "10"));
	}
	public static String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder res = new StringBuilder();
        StringBuilder aBuilder = new StringBuilder(a);
        StringBuilder bBuilder = new StringBuilder(b);
        aBuilder.reverse();
        bBuilder.reverse();
        int len1 = Math.min(a.length(), b.length());
        int i = 0;
        for (; i < len1; i++) {
        	int k1 = aBuilder.charAt(i) - '0';
        	int k2 = bBuilder.charAt(i) - '0';
        	int temp = (k1 + k2 + carry)%2;
        	carry = (k1 + k2 + carry)/2;
        	res.append(temp + "");
        }
        if (a.length() == i) {
        	for (;i < b.length(); i++) {
        		int k1 = bBuilder.charAt(i) - '0';
        		int temp = (k1 + carry)%2;
        		carry = (k1  + carry)/2;
            	res.append(temp + "");
        	}
        }
        else {
        	for (;i < a.length(); i++) {
        		int k1 = aBuilder.charAt(i) - '0';
        		int temp = (k1 + carry)%2;
        		carry = (k1  + carry)/2;
            	res.append(temp + "");
        	}
        }
        if (carry == 1) {
        	res.append("1");
        }
        res.reverse();
		return res.toString();
        
    }

}
