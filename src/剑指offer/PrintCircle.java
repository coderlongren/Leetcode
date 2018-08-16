package 剑指offer;

import java.util.ArrayList;
import java.util.List;

import 位运算.max;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月5日 下午4:39:33
* 类说明: 
*/
public class PrintCircle {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},
						 {12,13,14,5},
						 {11,16,15,6},
						 {10,9,8,7}};
		List<Integer> list = printMatirx(matrix);
		for (int item : list) {
			System.out.println(item);
		}
		
	}
	public static ArrayList<Integer> printMatirx(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return new ArrayList<>();
		}
		int rowStart = 0;
		int rowEnd = matrix.length - 1;
		int colEnd = matrix[0].length - 1;
		int colStart = 0;
		List<Integer> res = new ArrayList<>();
		while (rowStart <= rowEnd &&colStart <= colEnd) {
			for (int i = colStart; i <= colEnd; i++) {
				res.add(matrix[rowStart][i]);
			}
			rowStart++;
			for (int i = rowStart; i <= rowEnd; i++) {
				res.add(matrix[i][colEnd]);
			}
			colEnd--;
			
			if (rowStart <= rowEnd) {
				for (int i = colEnd; i >= colStart; i--) {
					res.add(matrix[rowEnd][i]);
				}
				rowEnd--;
			}
			if (colStart <= colEnd) {
				for (int i = colStart; i < colEnd; i++) {
					res.add(matrix[rowStart][i]);
				}
				colStart++;
			}
		}
		return (ArrayList<Integer>) res;
	}
	
}
