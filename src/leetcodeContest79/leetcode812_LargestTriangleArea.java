package leetcodeContest79;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import test.person;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月8日 上午9:31:42
* 类说明: 
*/
public class leetcode812_LargestTriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Point[] points = new Point[3];
//		points[0] = new Point(1, 2);
//		points[1] = new Point(2, 2);
//		points[2] = new Point(4, 2);
////		points[3] = new Point(2, 4);
////		points[4] = new Point(3, 3);
////		points[5] = new Point(4, 2);
//		List<Point> list = outerTrees(points);
////		for (Point point : list) {
//			System.out.println(point.x + "," + point.y);
//		}
		int[][] points = {{0,0},{0,1},{1,0},{0,2},{2,0}};
		System.out.println(largestTriangleArea(points));
	}
	// 暴力一波
	public static double largestTriangleArea(int[][] points) {
		if (points.length <= 2) {
			return 0;
		}
		double area = 0;
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				for (int k = 0; k < points.length; k++) {
//					if (points[i][0] == points[k][0] && points[i][1] == points[k][1] || points[j][0] == points[k][0] && points[j][0] == points[k][1]) {
//						continue;
//					}
					area = Math.max(area, Math.abs(points[i][0]*points[j][1] + points[j][0]*points[k][1] + points[k][0]*points[i][1] - points[i][0]*points[k][1] - points[i][0]*points[k][1] - points[j][0]*points[i][1]));
					
				}
			}
		}
		return area;
    }
	 public static List<Point> outerTrees(Point[] points) {
	        Set<Point> ans = new HashSet<>();
	        if (points.length == 1){
	            ans.add(points[0]);
	            return new ArrayList<>(ans);
	        }
	        for (int i = 0; i < points.length; i++){
	            for (int j = i + 1; j < points.length; j++){
	                int oneSide = 0;
	                for (int k = 0; k < points.length; k++){
	                    if (k == i || k == j) continue;
	                    if (calcuTriangle(points[i], points[j], points[k]) > 0){
	                        oneSide++;
	                    }
	                }

	                if (oneSide == points.length-2 || oneSide == 0){
	                    ans.add(points[i]);
	                    ans.add(points[j]);
	                }

	                int otherSide = 0;
	                for (int k = 0; k < points.length; k++){
	                    if (k == i || k == j) continue;
	                    if (calcuTriangle(points[i], points[j], points[k]) < 0){
	                        otherSide++;
	                    }
	                }

	                if (otherSide == points.length-2 || otherSide == 0){
	                    ans.add(points[i]);
	                    ans.add(points[j]);
	                }

	            }
	        }

	        return new ArrayList<>(ans);
	    }
	    private static int calcuTriangle(Point a1, Point a2, Point a3) {
	        return a1.x * a2.y + a3.x * a1.y + a2.x * a3.y 
	                - a3.x * a2.y - a2.x * a1.y - a1.x * a3.y;
	    }
	    private static int canCalcu(int x1, int y1, int x2, int y2, int x3, int y3) {
			return y3;
//	    	return x1*y2 + x3*y1
	    }

}
class Point{
	 int x;
	 int y;
	 Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
}