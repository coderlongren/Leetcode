/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��18�� ����10:40:52
* ��˵��: �ָ��ַ��� Ϊ
*/
public class leetcode459_repeated_substring_pattern {

	public static void main(String[] args) {
		String str = "abcab";
		System.out.println(str.substring(0, 2));
		System.out.println(repeatedSubstringPattern(str));
	}	
	// 
	public static boolean repeatedSubstringPattern(String s) {
		int len = s.length();
		
		for (int i = len/2; i >= 1; i--){
			// �����һ�������������Ӵ��Ļ�������һ������ S�ĳ���
			if (len%i == 0){
				int tem = len/i;
				StringBuilder stringBuilder = new StringBuilder();
				for (int j = 0; j < tem; j++){
					stringBuilder.append(s.substring(0, i));
				}
				if (stringBuilder.toString().equals(s)){
					return true;
				}
			}
		}
		
		
		return false;
		
    }
	
}
