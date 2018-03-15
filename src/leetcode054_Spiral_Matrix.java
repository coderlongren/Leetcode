import java.util.ArrayList;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��15�� ����7:06:01
* ��˵��: 
*/
public class leetcode054_Spiral_Matrix {
	 public static List<Integer> spiralOrder(int[][] matrix) {
		 List<Integer> res = new ArrayList<>();
	     if (matrix == null) {
	    	 return res;
	     }
	     int rowBegin = 0;
	     int rowEnd = matrix.length - 1;
	     int colBegin = 0;
	     int colEnd = matrix[0].length - 1;
	     
	     while (rowBegin <= rowEnd && colBegin <= colEnd) {
	    	 // ���� ����
	    	 for (int i = colBegin; i <= colEnd; i++) {
	    		 res.add(matrix[rowBegin][i]);
	    	 }
	    	 rowBegin++;
	    	 // ���±���
	    	 for (int j = rowBegin; j <= rowEnd; j++) {
	    		 res.add(matrix[j][colEnd]);
	    	 }
	    	 colEnd--;
	    	 if (rowBegin <= rowEnd) {
	    		 for (int i = colEnd; i >= colBegin; i--) {
	    			 res.add(matrix[rowEnd][i]);
	    		 }
	    	 }
	    	 rowEnd--;
	    	 
	    	 if (colBegin <= colEnd) {
	    		 for (int j = rowEnd; j >= rowBegin; j--) {
	    			 res.add(matrix[j][colBegin]);
	    		 }
	    	 }
	    	 colBegin++;
	     }
	     return res;
	 }
	 public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(spiralOrder(matrix));
	}

}
