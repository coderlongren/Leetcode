import java.util.Arrays;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月30日 上午10:21:44
* 类说明:  这种方法 不太直观。
*/
public class leetcode475_Heaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		
		System.out.println(	Arrays.binarySearch(a, 4));
	}
	public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int result = Integer.MIN_VALUE;
        
        for (int house : houses) {
            int index = Arrays.binarySearch(heaters, house);
            if (index < 0) {
        	index = -(index + 1);
            }
            int dist1 = index - 1 >= 0 ? house - heaters[index - 1] : Integer.MAX_VALUE;
            int dist2 = index < heaters.length ? heaters[index] - house : Integer.MAX_VALUE;
        
            result = Math.max(result, Math.min(dist1, dist2));
        }
        
        return result;
    }

}
