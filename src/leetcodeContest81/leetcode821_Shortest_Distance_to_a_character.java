package leetcodeContest81;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��22�� ����10:34:55
* ��˵��: 
*/
public class leetcode821_Shortest_Distance_to_a_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "loveleetcode";
		char C = 'e';
		for (int i : shortestToChar(S, C)) {
			System.out.print(i);
		}
	}
	public static int[] shortestToChar(String S, char C) {
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
        	if (map.containsKey(S.charAt(i))) {
        		List<Integer> tempList = map.get(S.charAt(i));
        		tempList.add(i);
        		map.put(S.charAt(i), tempList);
        	}
        	else {
        		List<Integer> newList = new ArrayList<>();
        		newList.add(i);
        		map.put(S.charAt(i), newList);
        	}
        }
        int[] res = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
        	int min = Integer.MAX_VALUE;
        	for (int temp : map.get(C)) {
        		min = Math.min(min, Math.abs(i - temp));
        	}
        	res[i] = min;
        }
        return res;
    }

}
