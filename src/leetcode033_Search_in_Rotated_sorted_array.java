/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��27�� ����9:58:43
* ��˵��:  ʲô��û�п��ǣ���ʵ�ǿ���ͨ�����ַ���ʵ�ֵ�
*/
public class leetcode033_Search_in_Rotated_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i] == target) {
        		return i;
        	}
        }
        return -1;
    }

}
