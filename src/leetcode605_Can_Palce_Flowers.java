/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月13日 下午3:37:44
* 类说明: 
*/
public class leetcode605_Can_Palce_Flowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] flowerbed = {0};
		System.out.println(canPlaceFlowers(flowerbed, 3));
	}
	// 这道题就是使用的 贪心算法， 只要保证在当前状况下是最忧的，那么整体也就能保证最优了
	 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		 int count = 0;
		 int i = 0;
		 
		 if (flowerbed.length == 1 && flowerbed[0] == 0){
			 return true;
		 }
		 
		 
		 // 需要在每一次循环时候，保证最优解
		 
		 while (i < flowerbed.length){
			 
			 // 
			 while (i < flowerbed.length && flowerbed[i] == 0){
				 i++;
				 // 这次选择是 00 出现在开始，或者 结束位置 种一朵花
				 if ((i == 1 || i == flowerbed.length - 1) && i < flowerbed.length && flowerbed[i] == 0){
					 count++;
				 }
				 // 这里 必须else if() 因为两端的选择是不能和 2~length - 2之间的重复选择的
				 // i - 1位置已经是0了，如果再保证 i, i + 1位置也是0的话，就可以种一朵花了
				 else if (i < flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[++i] == 0){
					 count++;
				 }
			 }
		 	i++;
			 if (count >= n){
				return true; 
			 }
		 }
		 return false;
	 }

}
