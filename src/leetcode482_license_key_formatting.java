/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月30日 下午3:42:34
* 类说明:  哪里找来的 无聊的题目啊 
*/
public class leetcode482_license_key_formatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String S = "5F3Z-2e-9-w";
		String S = "2-5g-3-J";
		int K = 4;
		System.out.println(licenseKeyFormatting(S, 2));
	}
	public static  String licenseKeyFormatting(String S, int K) {
        
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < S.length(); i++){
			if (S.charAt(i) != '-'){
				stringBuilder.append(S.charAt(i));
			}
		}
		String newString = stringBuilder.toString();
		if (newString.length() == 1){
			return newString.toUpperCase();
		}
		int zhengchu = stringBuilder.length()/K;
		int yushu = stringBuilder.length()%K;
		StringBuilder result = new StringBuilder();
		int k = 0;
		for (; k < yushu; k++){
			result.append(newString.charAt(k));
		}
		if (result.length() != 0){
			result.append("-");
		}
		for (int i = 0; i < zhengchu; i++){
			for (int j = 0; j < K; j++){
				result.append(newString.charAt(k++));
			}
			if (i < zhengchu - 1){
				result.append("-");
			}
		}
		
		return result.toString().toUpperCase();
		
    }

}
