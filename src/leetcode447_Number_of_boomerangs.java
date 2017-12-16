import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月16日 下午9:16:46
* 类说明: 
*/
public class leetcode447_Number_of_boomerangs {

	public static void main(String[] args) {
		int[][] points = {{0,0},{1,0},{2,0}};
		System.out.println(numberOfBoomerangs(points));
	}
	public static int numberOfBoomerangs(int[][] points) {
		int result = 0; 
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < points.length; i++){
			for (int j = 0; j < points.length; j++){
				if (i == j){
					continue;
				}
				int d = getDistance(points[i], points[j]);
				map.put(d, map.getOrDefault(d, 0) + 1);
			}
			for (int val : map.values()){
				result += val*(val - 1);
			}
			map.clear();
		}
		
		return result;
    }
	public static int getDistance(int[] a,int[] b){
		int x = a[0] - b[0];
		int y = a[1] - b[1];
//		return (int) Math.sqrt(x*x + y*y);
		return x*x + y*y;
	}

}
