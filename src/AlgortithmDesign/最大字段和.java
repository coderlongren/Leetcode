package AlgortithmDesign;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��17�� ����2:30:13
* ��˵��:   ʱ�临�Ӷ�o(2)�Ľⷨ  ��ʹ�� ��̬�滮
*/
public class ����ֶκ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1,-5,100,2,5,5,-100111};
		System.out.println(maxSum(nums));
	}
	public  static int maxSum(int[] nums){
		int sum = 0;
		for (int i = 0; i < nums.length; i++){
			int thissum = 0;
			for (int j = i; j < nums.length;j++){
				thissum += nums[j];
				sum = Math.max(sum, thissum);
			}
		}
		return sum;
	}
	
	

}
