import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月15日 下午7:06:01
* 类说明: 
*/
public class leetcode054_Spiral_Matrix {
	 public static List<Integer> spiralOrder(int[][] matrix) {
		 List<Integer> res = new ArrayList<>();
	     if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
	    	 return res;
	     }
	     int rowBegin = 0;
	     int rowEnd = matrix.length - 1;
	     int colBegin = 0;
	     int colEnd = matrix[0].length - 1;
	     
	     while (true) {
	    	 for (int i = colBegin; i <= colEnd; i++) {
	    		 res.add(matrix[rowBegin][i]);
	    	 }
	    	 rowBegin++;
	    	 if (rowBegin > rowEnd || colBegin > colEnd) {
	    		 break;
	    	 }
	    	 for (int i = rowBegin; i <= rowEnd; i++) {
	    		 res.add(matrix[i][colEnd]);
	    	 }
	    	 colEnd--;
	    	 if (rowBegin > rowEnd || colBegin > colEnd) {
	    		 break;
	    	 }
	    	 for (int i = colEnd; i >= colBegin; i--) {
	    		 res.add(matrix[rowEnd][i]);
	    	 }
	    	 rowEnd--;
	    	 if (rowBegin > rowEnd || colBegin > colEnd) {
	    		 break;
	    	 }
	    	 for (int i = rowEnd; i >= rowBegin; i--) {
	    		 res.add(matrix[i][colBegin]);
	    	 }
	    	 colBegin++;
	    	 if (rowBegin > rowEnd || colBegin > colEnd) {
	    		 break;
	    	 }
	     }
	     
	     return res;
	 }
	 public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(spiralOrder(matrix));
	}

}
