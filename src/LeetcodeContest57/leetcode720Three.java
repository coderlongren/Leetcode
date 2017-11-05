package LeetcodeContest57;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class leetcode720Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"yo","ew","fc","zrc","yodn","fcm","qm","qmo","fcmz","z","ewq","yod","ewqz","y"};
		Arrays.sort(words);
		System.out.println(words[2].substring(0,words[2].length() - 1));
		System.out.println("app".substring(0,2));
		System.out.println(longestWord(words));
	}
	public static String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> set = new HashSet<String>();
        String max = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 1 || set.contains(words[i].substring(0, words[i].length() - 1))) {
                set.add(words[i]);
                if (max.length() < words[i].length()) max = words[i];
            }
        }
        return max;
    }

}
