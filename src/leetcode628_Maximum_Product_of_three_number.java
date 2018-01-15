import java.util.Arrays;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��14�� ����10:14:10
* ��˵��: 
*/
public class leetcode628_Maximum_Product_of_three_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 // �������һ�� ������
	public int maximumProduct(int[] nums) {
        // �ǲ���Ӧ�����ж�һ�� ����Ԫ�� ������ ���Ǹ���
		int max = Integer.MIN_VALUE;
		
		for (int i : nums) {
			max = Math.max(max, i);
		}
		
		Arrays.sort(nums);
		int len = nums.length;
		// ����һ���ıȽ� �㹻�����ˣ� �Լ�������ʱ�򣬴����ֱ����Ŀ�ð�������
		int sum = nums[len - 1]*nums[len - 2]*nums[len - 3];
		sum = Math.max(sum, nums[0]*nums[1]*nums[2]);
		sum = Math.max(sum, nums[0]*nums[1]*nums[len - 1]);
		sum = Math.max(sum, nums[0]*nums[len - 1]*nums[len - 2]);
		return sum;
    }

}
