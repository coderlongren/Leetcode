package DP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月21日 下午10:00:07
* 类说明: 
*/
public class 最大无重复子串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder("abc");
		builder.delete(0,3);
		String string = "abcabcdaaa";
		System.out.println(logestNotPoliatod(string));
	}
	public static String logestNotPoliatod(String string) {
		Map<Character, Integer> map = new HashMap<>();
		Map<Integer, List<String>> subStrings = new HashMap<>();
		StringBuilder builder = new StringBuilder();
		int max = Integer.MIN_VALUE;
		int temp = 0;
		for (int i = 0; i < string.length(); i++) {
			if (map.keySet().contains(string.charAt(i))) {
				i = map.get(string.charAt(i));
				if (subStrings.containsKey(temp)) {
					subStrings.get(temp).add(builder.toString());
				}
				else {
					List<String> list = new ArrayList<>();
					list.add(builder.toString());
					subStrings.put(temp, list);
				}
				builder.delete(0, builder.length());
				temp = 0;
				map.clear();
			}
			else {
				map.put(string.charAt(i), i);
				builder.append(string.charAt(i));
				temp++;
				max = Math.max(max, temp);
			}
		}
		
		return subStrings.get(max).get(0);
	}

}
