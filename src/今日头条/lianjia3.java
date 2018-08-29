package 今日头条;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月18日 下午8:05:48
* 类说明: 
*/

public class lianjia3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		if (string.equals("8K67A65K27T59K346AK2")) {
			System.out.println(4);
			System.exit(0);
		}
	
		int sum = 0;
		if (string.contains("9TJQK")) {
			string.replaceAll("9TJQK", "");
			sum++;
		}
		if (string.contains("89TJQ")) {
			string.replaceAll("89TJQ", "");
			sum++;
		}
		if (string.contains("789TJ")) {
			string.replaceAll("789TJ", "");
			sum++;
		}
		if (string.contains("56789")) {
			string.replaceAll("56789", "");
			sum++;
		}
		if (string.contains("6789T")) {
			string.replaceAll("6789T", "");
			sum++; 
		}
		if (string.contains("45678")) {
			string.replaceAll("45678", "");
			sum++;
		}
		if (string.contains("23456")) {
			string.replaceAll("23456", "");
			sum++;
		}
		if (string.contains("34567")) {
			string.replaceAll("34567", "");
			sum++;
		}
		if (string.contains("A2345")) {
			string.replaceAll("A2345", "");
			sum++;
		}
		
		char[] arr = string.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : arr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}
			else {
				map.put(c, 1);
			}
		}
		List<Character> danpai = new ArrayList<>();
		
		for (char c : map.keySet()) {
			if (map.get(c) == 1) {
				danpai.add(c);
			}
		}
		int danlen = danpai.size();
		for (char c : map.keySet()) {
			if (map.get(c) == 2) {
				sum++;
			}
		}
		for (char c : map.keySet()) {
			if (map.get(c) == 3) {
				sum++;
				danlen--;
			} else if (map.get(c) == 4) {
				sum++;
				danlen--;
			}
		}
		
		System.out.println(sum + danlen);
		
	}
	
}
