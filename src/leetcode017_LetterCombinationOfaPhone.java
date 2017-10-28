import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class leetcode017_LetterCombinationOfaPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//³¬Ê±µÄ Ëã·¨ 
	public List<String> letterCombinations(String digits) {
		List<String> list = new ArrayList<String>();
		HashMap<Character, String> map = new HashMap<Character, String>();
		map.put('0', ",");
		map.put('1', ",");
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		
		char[] characters = digits.toCharArray();
		for (int i = 0; i < characters.length; i++){
			for (int j = 0; j < map.get(characters[i]).length(); j++){
				
			}
			
		}
		return list;
    }
}
