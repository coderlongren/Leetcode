/**
* @author 作者 : coderlong
* @version 创建时间：2018年7月23日 上午10:52:00
* 类说明: 
*/
public class leetcode87_Koko_Eating_Bananas {
	public static void main(String[] args) {
		int[] piles = {30,11,23,4,20};
		System.out.println(minEatingSpeed(piles, 5));
	}
	public static int minEatingSpeed(int[] piles, int H) {
        int min = 1; // 最小，就是每小时吃一根把
        int max = 1; // 最大为， 每小时吃完最大的那堆香蕉
        for (int pile : piles) {
        	max = Math.max(max, pile);
        }
        while (min < max) {
        	int mid = (min + max)/2;
        	if (can_finished(piles, mid, H)) {
        		max = mid;
        	} else {
        		min = mid + 1;
        	}
        }
        return min;
    }
	// 每小时吃pir个香蕉，能在H小时内吃完所有的香蕉
	public static boolean can_finished(int[] piles, int pir, int H) {
		int sum = 0;
		int count = 0;
		for (int pile : piles) {
			if (pile <= pir) {
				count++;
			} 
			else {
				if (pile%pir == 0) {
					count += (pile/pir);
				}
				else {
					count += (pile/pir + 1);
				}
			}
			if (count > H) {
				return false;
			}
		}
		return count <= H;
	}
}
