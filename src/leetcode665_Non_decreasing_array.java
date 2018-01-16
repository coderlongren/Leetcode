/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��16�� ����6:26:26
* ��˵��: 
*/
public class leetcode665_Non_decreasing_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,4,2,5};
		System.out.println(checkPossibility(nums));
	}
	// �⿴���������� ����̰�����ʵ�  ���Է������־���õ���
	public static boolean checkPossibility(int[] nums) {
	    // 1 2 3 4 5 '2' 6
		// 1 2 3 4 5 6
		int count = 0;
		for (int i = 0; i < nums.length - 1 && count <= 1; i++){
			if (nums[i] > nums[i + 1]){
				count++;
				//���������
				if ((i == 0 || nums[i - 1] < nums[i + 1])){
					nums[i] = nums[i + 1];
				}
				else {
					nums[i + 1] = nums[i];
				}
			}
		}
		return count <= 1;
	 }

}
