import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月11日 下午3:39:41
* 类说明:  
*/
public class leetcode074_Search_a_2D_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,3,5,7},{10,11,15,20},{23,30,34,50}};
		System.out.println(searchMatrix(matrix, 3));
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (cols == 1) {
        	for (int i = 0; i < matrix.length; i++) {
        		if (matrix[i][0] == target) {
        			return true;
        		}
        	}
        	return false;
        }
        if (rows == 1) {
        	for (int i = 0; i < matrix[0].length; i++) {
        		if (matrix[0][i] == target) {
        			return true;
        		}
        	}
        	return false;
        }
        int x = 0;
        int y = matrix[0].length - 1;
        while (x < matrix.length && y < matrix[0].length && x >= 0 && y >= 0) {
        	if (matrix[x][y] == target) {
        		return true;
        	}
        	else if (target < matrix[x][y]) {
        		y--;
        	}
        	else {
        		x++;
        	}
        	
        }
        return false;
    }
	// 替换为精简写法
	public boolean searchMatrix3(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        int col = matrix[0].length-1;
        int row = 0;
        while(col >= 0 && row <= matrix.length-1) {
            if(target == matrix[row][col]) {
                return true;
            } else if(target < matrix[row][col]) {
                col--;
            } else if(target > matrix[row][col]) {
                row++;
            }
        }
        
        return false;
    }
	
	public static boolean searchMatrix2(int[][] matrix, int target) {
		int n = matrix.length; // rows
		int m = matrix[0].length; // cols
		int l = 0;
		int r = m*n - 1;
		
		while (l != r) {
			int mid = (l + r - 1) >> 1;
        	if (matrix[mid / m][mid % m] < target) {
        	}
		}
		return false;
	}

}
