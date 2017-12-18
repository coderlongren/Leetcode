package leetcodeContest63;

import java.util.HashMap;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��18�� ����10:13:26
* ��˵��:  ����û�������Ⱑ�� 
*/
public class leetcode748_Shortest_Completing_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String licensePlate = "Ah71752";
		String[] words = {"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"};
		
//		["suggest","letter","of","husband","easy","education","drug","prevent","writer","old"]
		System.out.println(shortestCompletingWord(licensePlate, words));
	}
	// ���discuss ����ʹ�õ�CharecterMap, �о���ȷ����,���Ҿ�ʹ��char-map��
	// ˼·����һ����
	public static String shortestCompletingWord(String licensePlate, String[] words) {
		String target = licensePlate.toLowerCase();
		Map<Character,Integer> charMap = new HashMap<>();
		for(int i = 0; i < target.length(); i++){
			if (Character.isLetter(target.charAt(i))){
				charMap.put(target.charAt(i), charMap.getOrDefault(target.charAt(i), 0) + 1);
			}
		}
		int minLen = 100;
		String result = "";
		for (int i = 0; i < words.length; i++){
			String word = words[i];
			if (matches(word, charMap) && word.length() < minLen){
				minLen = word.length();
				result = words[i];
			}
		}
		return result;
	}
	// ����ƥ�亯��
	public static boolean matches(String word,Map<Character, Integer> charMap){
		Map<Character, Integer> targetMap = new HashMap<>();
		for (Character c = 'a'; c <= 'z'; c++){
			targetMap.put(c, 0);
		}
		for(int i = 0; i < word.length(); i++){
			if (Character.isLetter(word.charAt(i))){
				targetMap.put(word.charAt(i),targetMap.get(word.charAt(i)) + 1);
			}
		}
		for (Character character : charMap.keySet()){
			if (targetMap.get(character) < charMap.get(character)){
				return false;
			}
		}
		return true;
	}

}
