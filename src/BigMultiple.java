import java.sql.ResultSet;
import java.util.List;


public class BigMultiple {

	//java������� �ӵ���  ���˺ö෽������������Ϊ Res[] ���ô�С��ʱ�� ����һλ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println('2' - '0');
//		
//		int[] a = new int[6];
//		a[2] = 5;
//		StringBuilder stringBuilder = new StringBuilder("");
		String string1 = "5";
		String string2 = "40";
		System.out.println(multiple(string1, string2));
//		System.out.println(Long.MAX_VALUE);
	}
	
	public static String multiple(String x,String y){
		String result = "";
		if (x == "1"){
			return y;
		}
		if (y == "1"){
			return x;
		}
		char[] str1 = x.toCharArray();
		char[] str2 = y.toCharArray();
		int length1 = str1.length;
		int length2 = str2.length;
		int[] res =new int[length1 + length2 - 1];
		//���еѿ����� 
		for (int i = 0; i < length1; i++){
			int n1 = str1[i] - '0';
			for (int j = 0; j < length2; j++){
				int n2 = str2[j] - '0';
				res[i + j] += n1*n2;
			}
		}
			
		for (int i = res.length - 1; i > 0; i--){
				res[i - 1] += res[i]/10;
				res[i] = res[i]%10;		
		}
		for (int i = 0; i< res.length ;i++){
			result+=res[i];
		}
		return result;
	}
}
		//���еѿ����� 
//		for (int i = 0; i < str1.length; i++){
//			int n1 = str1[length1 - i - 1] - '0';
//			int num = 0;
//			for (int j = 0; j < str2.length; j++){
//				int n2 = str2[length2 - j - 1] - '0';
//				num = num + n1*n2 + res[ i + j];
//				res[i + j] = num%10;
//				num = num/10;
//			}
//			//����һ��ѭ��֮�� ���н�λ�Ļ� �ٽ�λ
//			res[i + length2] = num;
//		}
//		int i = length1 + length1 - 1;
//		//��������λ�� 
//		while (i >= 0 && res[i] == 0) {
//			i--;
//		}
//		while (i >= 0){
//			result += res[i--];
//		}
//		return result;
//		//ѭ����λ
//		for (int i = res.length - 1; i >= 0; i--){
//			int t = (int) (res[i] + carry);
//			res[i] = t%10;
//			carry = t/10;
//		}
//		List<Integer> list = 
		//��������Ȼ�н�λ 
				
//		while (carry != 0){
//			int t = carry = carry/10;
//			
//		}
//		return result;
	
