package leetcodeContest77;

import java.util.HashSet;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��7�� ����7:10:06
* ��˵��: 
*/
public class leetcode804_Unique_Morse_Code_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		for (char c : "sdf".toCharArray()) {
			
		}
	}
	// �ڿ���̨������Ĵ��룬 IDE���ǳ���Ա���ϰ�����
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
