package Mock_Interview_One;

import lanqiao.org.shiliuToShi;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月8日 下午1:09:57
* 类说明: 
*/
public class CountAndSay {
	public static String countAndSay(int n) {
        String init = "1";
        for (int i = 1; i <= n; i++) {
        	init = countAndSay(init);
        }
        return init;
    }
	public static String countAndSay(String init) {
		int count = 1;
		String teString = "";
		char[] chars = init.toCharArray();
		char last = chars[0];
		
		for (int i = 1; i < chars.length; i++) {
			if (chars[i] == last) {
				count++;
			}
			else {
				teString += count + "" + last; 
			}
		}
		teString += count + "" + last;
		return teString;
	}
	public static void main(String[] args) {
		System.out.println(countAndSay(4));
	}
}
