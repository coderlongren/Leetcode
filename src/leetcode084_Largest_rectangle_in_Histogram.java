/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月24日 下午3:45:38
* 类说明: 
*/
public class leetcode084_Largest_rectangle_in_Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights = {2,0,2};
		System.out.println(largestRectangleArea(heights));
	}
	public static int largestRectangleArea(int[] heights) {
		int area = Integer.MIN_VALUE;
		if (heights == null || heights.length == 0) {
            return 0;
        }
		for (int i = 0; i < heights.length; i++) {
			int left = 0;
			int right = 0;
			for (int l = i - 1; l >= 0; l--) {
				if (heights[l] >= heights[i]) {
					left++;
				}
				else {
					break;
				}
			}
			for (int r = i + 1; r < heights.length; r++) {
				if (heights[r] >= heights[i]) {
					right++;
				}
				else {
					break;
				}
			}
			area = Math.max(area, heights[i]*(1 + left + right));
		}
		return area;
    }

}
