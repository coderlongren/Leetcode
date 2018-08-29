/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月24日 上午10:38:39
* 类说明: 
*/
public class leetcode085_Matrix_rectangle {
	public static void main(String[] args) {
		String[][] matrix = {{"1","0","1","0","0"},
				{"1","0","1","1","1"},
				{"1","1","1","1","1"},
				{"1","0","0","1","0"}};
		System.out.println(maximalRectangle(matrix));
	}
    public static int maximalRectangle(String[][] matrix) {
    	if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
    		return 0;
    	}
    	int[] height = new int[matrix[0].length];
    	int max = 0;
    	for (int i = 0; i < matrix.length; i++) {
    		// 这里的循环是最精妙之处，相当于求出以当前行为地面，求面积最大的矩形。
    		// height 一直维持着 每座山峰的高度
    		for (int j = 0; j < height.length; j++) {
    			if (matrix[i][j] == "1") {
    				height[j] += 1;
    			}
    			else {
    				height[j] = 0;
    			}
    		}
    		max = Math.max(max, maxarea(matrix, height));
    	}
    	return max;
    }
    public static int maxarea(String[][] matrix, int[] height) {
    	int n = height.length;
    	int[] left = new int[n];
    	int[] right = new int[n];
    	left[0] = -1; // left记录 每座山峰的最左边 >= 自己的坐标
    	right[n - 1] = n; // right 记录每座山峰最右边 >= 自己的坐标
    	for (int i = 1; i < n; i++) {
    		int p = i - 1;
    		while (p >= 0 && height[p] >= height[i]) {
    			p = left[p];
    		}
    		left[i] = p;
    	}
    	for (int i = n - 2; i >= 0; i--) {
    		int p = i + 1;
    		while (p < n && height[p] >= height[i]) {
    			p = right[p];
    		}
    		right[i] = p;
    	}
    	int max = 0;
    	for (int i = 0; i < n; i++) {
    		max = Math.max(max, height[i] * (right[i] - left[i]));
    	}
    	return max;
    }
}
