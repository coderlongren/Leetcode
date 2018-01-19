/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月19日 下午8:47:01
* 类说明: 
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
