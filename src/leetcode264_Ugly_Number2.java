import java.util.ArrayList;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��3�� ����10:30:21
* ��˵��: 
*/
public class leetcode264_Ugly_Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nthUglyNumber(7));
	} 
	public static int nthUglyNumber(int n) {
		if (n == 0) {
			return 0;
		}
		int[] dp = new int[n];
		List<Integer> list = new ArrayList<>();
		// ��ʵ����˼����ǣ� ÿһ��uglyNnumber ����֮ǰ��uglynumber *2 *3 *5 �õ���]
		list.add(1);
		int i2 = 0;
		int i3 = 0;
		int i5 = 0;
		for (int i = 1; i < n; i++) {
			int m2 = list.get(i2)*2;
			int m3 = list.get(i3)*3;
			int m5 = list.get(i5)*5;
			
			int min = Math.min(m2, Math.min(m3, m5));
			if (min == m2) {
				// 
				i2++;
				
			}
			if (min == m3) {
				i3++;
			}
			if (min == m5){
				i5++;
			}
			list.add(min);
		}
		
		return list.get(n - 1);
    }

}
