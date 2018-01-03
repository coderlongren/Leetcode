import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月3日 下午8:40:39
* 类说明: 
*/
public class leetcode500_keyboard_row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"Hello", "Alaska", "Dad", "Peace"};
		findWords(words);
	}
	public static String[] findWords(String[] words) {
		String[] strs = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            for(char c: strs[i].toCharArray()){
                map.put(c, i);//put <char, rowIndex> pair into the map
            }
        }
        
        List<String> res = new LinkedList<>();
        for (String string : words) {
			if (string == ""){
				continue;
			}
			int index = map.get(string.toUpperCase().charAt(0));
			boolean flag = true;
			for (Character character : string.toUpperCase().toCharArray()) {
				if (map.get(character) != index){
					flag = false;
					break;
				}
			}
			if (flag){
				res.add(string);
			}
			
		}
        String[] a = (String[])res.toArray(new String[res.size()]);
        return a;
    }

}
