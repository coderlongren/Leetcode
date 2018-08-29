import java.util.HashSet;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月28日 下午1:03:18
* 类说明: 
*/
public class leetcode_Possible_Bipartition {
	public static void main(String[] args) {
		
	}
	public boolean possibleBipartition(int N, int[][] dislikes) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		if (dislikes == null || dislikes.length == 0) {
			return false;
		}
		for (int[] item : dislikes) {
			if (!set1.contains(item[0])) {
				set1.add(item[0]);
				if (!set2.contains(item[1])) {
					set2.add(item[1]);
				} else {
					return false;
				}
			} else {
				if (!set2.contains(item[1])) {
					set2.add(item[1]);
				} else {
					return false;
				}
			}
			
		}
		return true;
    }
}
