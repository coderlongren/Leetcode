import java.util.HashSet;
import java.util.Set;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��5��24�� ����11:20:11
* ��˵��: 
*/
public class leetcode287_Find_The_Duplicated_element {
	public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
        	if (!set.add(num)) {
        		return num;
        	}
        }
        return 0;
    }
}
