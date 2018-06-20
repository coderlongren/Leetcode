package leetcodeContest72;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月3日 上午10:01:11
* 类说明: 
*/
public class leetcode846_hand_Of_Staights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] hand = {1,1,2,2,3,3};
		System.out.println(isNStraightHand(hand, 3));
	}
	
	public static boolean isNStraightHand(int[] hand, int W) {
		if (hand == null || hand.length == 0 || W <= 0) {
			return false;
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : hand) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		Arrays.sort(hand);
		for (int key : hand) {
			if (map.get(key) != 0) {
				map.put(key, map.get(key) - 1);
				if (!search(map, key, W)) { // cannot find a consecutive cards.
					return false;
				}
			}
		}
		return true;
		
    }
	public static boolean search(Map<Integer, Integer> map, int start, int W) {
		for (int i = start + 1; i < start + W; i++) {
			if (!map.containsKey(i)) {
				return false;
			}
			else if (map.get(i) == 0) {
				return false;
			}
			else {
				map.put(i, map.get(i) - 1);
			}
		}
		return true;
	}

}
