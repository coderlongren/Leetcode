import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月14日 下午7:41:47
* 类说明: 
*/
public class leetcode414_thrid_Maximum_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,3};
		System.out.println(thirdMax(nums));
	}
	public static int thirdMax(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for (Integer integer : nums) {
			set.add(integer);
		}
        
        if (set.size() <= 2){
        	int result = Integer.MIN_VALUE;
        	for (Integer integer : set) {
				result = Math.max(result, integer);
			}
        	return result;
        }
        else {
        	int result = Integer.MIN_VALUE;
        	int[] array = new int[set.size()];
        	int i = 0;
        	for (Integer integer : set) {
        		array[i++] = integer;
			}
        	
        	return array[set.size() - 3];
        }
    }
}
