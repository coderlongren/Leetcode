import java.util.Arrays;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��11�� ����10:24:20
* ��˵��: ��ȷ�ļ���
*/
public class leetcode_268_missing_number_best {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(missingNumber(new int[]{1}));
	}
	public static int missingNumber(int[] nums) { //binary search
	    Arrays.sort(nums);
	    int left = 0, right = nums.length, mid= (left + right)/2;
	    while(left<right){
	        mid = (left + right)/2;
	        if(nums[mid]>mid) right = mid;
	        else left = mid+1;
	    }
	    return left;
	}

}
