import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class leetcode720_LOngestWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a".substring(0,1));
		String[] words = {"yo","ew","fc","zrc","yodn","fcm","qm","qmo","fcmz","z","ewq","yod","ewqz","y"};
		System.out.println(longestWord(words));
	}
	 public static  String longestWord(String[] words) {
	        Arrays.sort(words);
	        for (int i = 0; i < words.length;i++){
	        	System.out.print(words[i] + ",");
	        }
	        Set<String> built = new HashSet<String>();
	        String res = "";
	        for (String w : words) {
	            if (w.length() == 1 || built.contains(w.substring(0, w.length() - 1))) {
	                res = w.length() > res.length() ? w : res;
	                built.add(w);
	            }
	        }
	        return res;
	    }

}
