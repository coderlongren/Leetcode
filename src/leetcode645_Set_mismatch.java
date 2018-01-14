import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月13日 下午10:11:40
* 类说明: 
*/
public class leetcode645_Set_mismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int num = 0;
        int len = nums.length;
        for (Integer integer : nums) {
			if (!set.add(integer)){
				num = integer;
			}
		}
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= len; i++){
        	if (!set.contains(i)){
        		list.add(i);
        	}
        }
        list.add(0, num);
        int[] res = new int[list.size()];
        int index = 0;
        for (int i : list) {
			res[index++] = i;
		}
       
        return res;
        
        
    }

}
