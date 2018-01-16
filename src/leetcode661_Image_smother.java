import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月16日 下午5:07:46
* 类说明: 
*/
public class leetcode661_Image_smother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[][] imageSmoother(int[][] M) {
		//根据过程 便利所有的可能就行了，不需要
		if (M == null){
			return null;
		}
		int rows = M.length;
		int cols = M[0].length;
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(-1);
		list.add(1);
		int[][] res = new int[rows][cols];
		
		for (int row = 0; row < rows; row++){
			for (int col = 0; col < cols; col++){
				int sum = 0;
				int count = 0;
				// 就[row,col] 这个坐标周围所有的 点进行判断 
				for (int i : list){
					for (int j : list){
						if (isValid(row + i, col + j, rows, cols)){
							count++;
							sum += M[row + i][col + j];
						}
					}
					
				}
				res[row][col] = (int)Math.floor((sum + 0.0)/(count + 0.0));
				
			}
		}
		return res;
    }
	public boolean isValid(int row,int col,int rows,int cols){
		return row>= 0 && col >= 0 && row < rows && col < cols;
	}

}
