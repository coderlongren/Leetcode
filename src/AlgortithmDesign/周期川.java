package AlgortithmDesign;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月12日 下午2:59:51
* 类说明: 
*/
public class 周期川 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMin("abcabcabcabc"));
	}
	public static int getMin(String string){
		// 这是我见过的最好的 求子串的解法
		
		for (int i = 1; i <= string.length(); i++){// i代表子串的长度，最小是1
			if (string.length() % i == 0){
				boolean flag = true;
				for (int j = i; j < string.length(); j++){
					// 下面一行代码非常 巧妙，j == j%i 
					if (string.charAt(j) != string.charAt(j%i)){
						flag = false;
						break;
					}
				}
				if (flag){
					return i; // 找到了最小串 直接返回
				}
			}
		}
		return string.length();
	}

}
