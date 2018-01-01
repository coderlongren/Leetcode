import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��13�� ����2:55:17
* ��˵��: 2������� ����Ԫ��
*/
public class leetcode349_Intersection_of_two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	// two points
	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[set.size()];
        int k = 0;
        for (Integer num : set) {
            result[k++] = num;
        }
        return result;
    }

}