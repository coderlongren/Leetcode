import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��11�� ����5:14:33
* ��˵��: ���ǹ���
*/
public class leetcode575_Distribute_candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// ��� ���ֻ���õ�n/2���ǹ��������� setȥ��candies֮��   n/2 set.size()/2 ȡСָ
	public int distributeCandies(int[] candies) {
		Set<Integer> set = new HashSet<>();
		for (Integer integer : candies) {
			set.add(integer);
		}
		
		return Math.min(set.size(), candies.length/2);
		
    }

}
