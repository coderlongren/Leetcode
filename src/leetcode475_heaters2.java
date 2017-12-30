import java.util.Arrays;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月30日 上午10:38:51
* 类说明:  这是 two points 的经典应用吗？
*/
public class leetcode475_heaters2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] houses = {282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923};
		int[] heaters = {823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612};
		System.out.println(findRadius(houses, heaters));
//		System.out.println(Arrays.binarySearch(houses, 2));
	}
	
	 public static int findRadius(int[] houses, int[] heaters) {
		 Arrays.sort(houses);
		 Arrays.sort(heaters);
		 int res = Integer.MIN_VALUE;
		 int j = 0;
		 for (int i = 0; i < houses.length; i++){
			 
			 // 找到距离符合要求的点，
			 while (j < heaters.length - 1 && Math.abs(heaters[j] - houses[i]) >= Math.abs(heaters[j + 1] - houses[i])){
				 j++;
			 }
			 // 最后需要找到 这些距离里面最打的距离（能够cover其他的房子）
			 res = Math.max(res, Math.abs(heaters[j] - houses[i]));
		 }
		 
		 return res;
	 }
}
