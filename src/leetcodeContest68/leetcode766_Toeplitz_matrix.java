package leetcodeContest68;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月21日 上午10:40:47
* 类说明: 
*/
public class leetcode766_Toeplitz_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,1}};
		System.out.println(isToeplitzMatrix(matrix));
	}
	public static boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i = 0;
        int j = 0;
        for (;j < cols; j++){
        	int temp = matrix[i][j];
        	int row = i;
        	int col = j;
        	while (row < rows && col < cols){
        		if (matrix[row][col] != temp){
        			return false;
        		}
        		row++;
        		col++;
        	}
        }
        
        j = 0;
        for (;i < rows; i++){
        	int temp = matrix[i][j];
        	int row = i;
        	int col = j;
        	while (row < rows && col < cols){
        		if (matrix[row][col] != temp){
        			return false;
        		}
        		row++;
        		col++;
        	}
        }
        return true;
    }
	
}
