import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class leetcode017_LetterCombination {

	public static void main(String[] args) {
		String string = "222";
		System.out.println(letterCombinations(string));
	}
	
	//³¬Ê±µÄ Ëã·¨ 
	public static  List<String> letterCombinations(String digits) {
		if (digits.length() == 0){
			List<String> a= new ArrayList<String>();
			return a;
		}
		String[] d = {",",",","abc","def","ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		List<String> list = new ArrayList<String>();
		list.add("");
		for (int i = 0; i < digits.length(); i++){
			List<String> temp = new ArrayList<String>();
			for (int j = 0; j < list.size(); j++){
				
				for (int k = 0; k < d[digits.toCharArray()[i] - '0'].length(); k++){
					temp.add(list.get(j) + d[digits.toCharArray()[i] - '0'].toCharArray()[k]);
				}
			}
			list = temp;
		}
		return list;
		
    }
}
