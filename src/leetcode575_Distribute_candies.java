import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月11日 下午5:14:33
* 类说明: 分糖果，
*/
public class leetcode575_Distribute_candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 姐姐 最多只能拿到n/2种糖果，所以在 set去重candies之后   n/2 set.size()/2 取小指
	public int distributeCandies(int[] candies) {
		Set<Integer> set = new HashSet<>();
		for (Integer integer : candies) {
			set.add(integer);
		}
		
		return Math.min(set.size(), candies.length/2);
		
    }

}
