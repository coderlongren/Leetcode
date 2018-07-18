import 位运算.max;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月24日 下午3:26:23
* 类说明:  A hard Question
* Given n non-negative integers representing an elevation map where the width
*/
public class leetcode042_Trapping_Rain_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(height));
	}
	// 给定的是一组整数, 求的是在由这一组整数所组成的山峰
	public static int trap(int[] height) {
		int sum = 0;
		if (height == null || height.length <= 2) {
			return sum;
		}
		int left = 0;
		int right = height.length - 1;
		
		int[] maxLeft = new int[height.length];
		int[] maxRight = new int[height.length];
		maxLeft[0] = 0;
		maxRight[maxRight.length - 1] = 0;
		// 下面的循环是记录每根柱子， 左边最大值， 右边最大值
		for (int i = 1; i < height.length; i++) {
			maxLeft[i] = Math.max(maxLeft[i - 1], height[i - 1]);
		}
		for (int i = height.length - 2; i >= 0; i--) {
			maxRight[i] = Math.max(maxRight[i + 1], height[i + 1]);
		}
		for (int i = 0; i < height.length; i++) {
			int min = Math.min(maxLeft[i], maxRight[i]);
			if (min > height[i]) {
				sum += (min - height[i]);
			}
		}
		return sum;
	}

	
}
