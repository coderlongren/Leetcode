package leetcodeContest77;

import java.util.HashSet;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月7日 下午7:10:06
* 类说明: 
*/
public class leetcode804_Unique_Morse_Code_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		for (char c : "sdf".toCharArray()) {
			
		}
	}
	// 在控制台打出来的代码， IDE真是程序员的障碍啊！
	public int uniqueMorseRepresentations(String[] words) {
        int res = 0;
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<String>();
        for (String word : words) {
            StringBuffer buffer = new StringBuffer();
            for (char c : word.toCharArray()) {
                buffer.append(codes[c - 'a']);
            }
            set.add(buffer.toString());
        }
        return set.size();
        
    }

}
