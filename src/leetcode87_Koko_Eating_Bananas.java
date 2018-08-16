/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��7��23�� ����10:52:00
* ��˵��: 
*/
public class leetcode87_Koko_Eating_Bananas {
	public static void main(String[] args) {
		int[] piles = {30,11,23,4,20};
		System.out.println(minEatingSpeed(piles, 5));
	}
	public static int minEatingSpeed(int[] piles, int H) {
        int min = 1; // ��С������ÿСʱ��һ����
        int max = 1; // ���Ϊ�� ÿСʱ���������Ƕ��㽶
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
	// ÿСʱ��pir���㽶������HСʱ�ڳ������е��㽶
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
