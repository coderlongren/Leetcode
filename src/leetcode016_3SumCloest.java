import java.util.Arrays;


public class leetcode016_3SumCloest {
	public static int main(String[] args){
		
		
		
		return 0;
	}
	public static int threeSumClosest(int[] nums, int target) {
		
		Arrays.sort(nums);
		int result = nums[0] + nums[1] + nums[nums.length - 1];
		
		for (int i= 0; i < nums.length - 2; i++){
			int left = i + 1;
			int right = nums.length - 1;
			
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				
				
				if (sum < target){
					left++;
				}else{// �����else if ������ʱ�� ���time limited ��Ϊ else
					right--;
				}
				if (Math.abs(sum - target) < Math.abs(result - target)){
					result = sum;
				}
			}
		}
        return result;
    }
}
