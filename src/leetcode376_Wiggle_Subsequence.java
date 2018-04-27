import java.math.BigInteger;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��20�� ����10:09:53
* ��˵��: 
*/
public class leetcode376_Wiggle_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bigInteger = new BigInteger("2123423423");
		System.out.println(bigInteger.multiply(new BigInteger("3445645645645756756756756756757")));
		System.out.println(2123423423*344564564);
		int[] nums = {2,1,6,3,2};
		System.out.println(wiggleMaxLength(nums));
	}
	// ����������O(n)ʱ�临�Ӷȵ� �ⷨ�� һ�����ǿ����벻�������
	public static int wiggleMaxLength(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		
		int k = 0;
		while (k < nums.length - 1 && nums[k] == nums[k + 1]) {
			k++;
		}
		if (k == nums.length - 1) {
			// ˵�� �����Ԫ��ȫ��һ��
			return 1;
		}
		// ���� ������Ԫ��
		int result = 2;
		// true ��һ����ϵ��small ; false ��һ����ϵ�� big
		boolean small = nums[k] < nums[k + 1];
		for (int i = k + 1; i < nums.length - 1; i++) {
			// ��һ����ϵ�� small �ڶ�����ϵ�� big�Ļ�
			if (small && nums[i] > nums[i + 1]) {
				// �任��ϵ�� result++
				nums[result] = nums[i + 1];
				result++;
				small = !small;
			}
			else {
				if (!small && nums[i] < nums[i + 1]) {
					nums[result] = nums[i + 1];
					result++;
					small = !small;
				}
				
			}
		}
		return result;
	}
	// ������O��n���Ľⷨ������Ƕ�̬�滮�ı�׼�ⷨ
	public static int wiggleMaxLength2(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		// ���ǿ������������� up[], down[] ����ʾ i ��Ӧ��������������������
		int[] up = new int[nums.length];
		int[] down = new int[nums.length];
		up[0] = 1;
		down[0] = 1; // ֻ��һ��Ԫ�ص�ʱ�����£�������������
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] > nums[i]) {
				up[i] = down[i - 1] + 1;
				down[i] = down[i - 1];
			}
			else if (nums[i - 1] < nums[i]) {
				up[i] = up[i - 1];
				down[i] = up[i - 1 + 1];
			}
			else {
				up[i] = up[i - 1];
				down[i] = down[i - 1];
			}
		}
		return Math.max(up[nums.length - 1], down[nums.length - 1]);
	}
}
