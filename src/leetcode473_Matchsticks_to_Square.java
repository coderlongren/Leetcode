import java.util.Arrays;
import java.util.Comparator;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��27�� ����11:09:43
* ��˵��: 
*/
public class leetcode473_Matchsticks_to_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] nums = {2,5,4,6,3,1};
		Arrays.sort(nums, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if (o1 > o2) {
					return -1;
				}
				else if(o1 == o2){
					return 0;
				}
				else {
					return 1;
				}
			}
			
		});
		for (int i : nums) {
			System.out.println(i);
		}
	}

}
