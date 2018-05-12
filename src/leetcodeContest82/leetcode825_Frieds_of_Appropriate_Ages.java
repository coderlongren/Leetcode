package leetcodeContest82;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月29日 上午10:04:57
* 类说明: 
*/
public class leetcode825_Frieds_of_Appropriate_Ages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = {20,30,100,110,120};
		System.out.println(numFriendRequests(ages));
	}
	public static int numFriendRequests(int[] ages) {
		int count = 0;
		if (ages == null || ages.length < 2) {
			return count;
		}
		Arrays.sort(ages);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : ages) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		for (int i : map.keySet()) {
			for (int j : map.keySet()) {
				if (func(i, j)) {
					if (i == j) {
						count += map.get(i)*(map.get(j) - 1);
					}
					else {
						count += map.get(i)*(map.get(j));
					}
				}
			}
		}
		return count;
	}
	public static boolean func(int a, int b) {
		return !(b <= 0.5*a + 7 || b > a || (b > 100 && a < 100));
	}

}
