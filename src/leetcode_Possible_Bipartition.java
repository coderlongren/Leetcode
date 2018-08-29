import java.util.HashSet;
import java.util.Set;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��28�� ����1:03:18
* ��˵��: 
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
