/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��19�� ����8:47:01
* ��˵��: 
*/
public class leetcode011_Container_with_most_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int maxArea(int[] height){
		int left = 0;
		int right = height.length - 1;
		int maxArea = Integer.MIN_VALUE;
		while (left < right){
			maxArea = Math.max(maxArea, (right - left)*Math.min(height[left], height[right]));
			if (height[left] < height[right]){
				left++;
			}
			else{
				right--;
			}
		}
		return maxArea;
	}

}
