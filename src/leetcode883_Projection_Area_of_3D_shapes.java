/**
* @author 作者 : coderlong
* @version 创建时间：2018年9月2日 上午9:10:05
* 类说明: 
*/
public class leetcode883_Projection_Area_of_3D_shapes {
	public static void main(String[] args) {
		
	}
	public int projectionArea(int[][] grid) {
		int len = grid.length;
		int area1 = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (grid[i][j] != 0) {
					area1 += 1;
				}
			}
		}
		int area2 = 0;
		int area3 = 0;
		for (int i = 0; i < len; i++) {
			int temp1 = 0;
			int temp2 = 0;
			for (int j = 0; j < len; j++) {
				temp1 = Math.max(temp1, grid[i][j]);
			}
			for (int k = 0; k < len; k++) {
				temp2 = Math.max(temp2, grid[k][i]);
			}
			area2 += temp1;
			area3 += temp2;
		}
		return area1 + area2 + area3;
	}
}
