import java.util.Arrays;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��27�� ����9:13:47
* ��˵��: 
* 6 5 4 8 7 5 1Ϊ����˵�������
* 
* 
* ���ȿ϶��Ӻ��濪ʼ����1��5������û���á�

7��5��1������Ҳû��Ч������˶�������8��7��5��1�ǵݼ��ġ�

�����Ҫ�ҵ���һ�����У��ҵ�������λ���ǹؼ���

��Ϊ������ſ���ʹ�������ø���

�����ҵ���4���Զ��׼�4������5������8����7������1��

��˾���Ҫ�ҳ���4������Щ����������С��ֵ�����������ߵ�����

��ô�������оͳ��ˣ�6 5 5 8 7 4 1

Ȼ�����һ���������8 7 4 1��һ��������
*/
public class leetcode031_Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {6, 5, 4, 8, 7, 5, 1};
		nextPermutation(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	public static void nextPermutation(int[] nums) {
        if (nums.length == 1) {
        	return ;
        }
        int length = nums.length;
        int index = length - 1;
        while (index >= 1 && nums[index] <= nums[index - 1])  {
        	index--;
        }
        if (index == 0){
        	Arrays.sort(nums);
        	return;
        }
        int temp = nums[index - 1]; // ��һ������������
        int second = Integer.MAX_VALUE;
        int second_index = index;
        for (int i = index; i < length; i++){
        	if (nums[i] > temp){
        		if (nums[i] < second) {
        			second = nums[i];
        			second_index =  i;
        		}
        	}
        }
        
        nums[index - 1] = nums[second_index];
        nums[second_index] = temp;
        
        // ʹ�������Ż���ð������
        for (int i = index; i < length - 1; i++){
        	boolean flag = false;
        	for (int j = index; j < length - 1 - i + index; j++){
        		if (nums[j] > nums[j + 1]) {
        			flag = true;
        			int temp1 = nums[j + 1];
        			nums[j + 1] = nums[j];
        			nums[j] = temp1;
        		}
        	}
        	if (!flag) {
        		break;
        	}
        }
    }

}
