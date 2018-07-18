/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��7��16�� ����11:06:38
* ��˵��: 
*/
public class leetcode868_Binary_gap {
	public static void main(String[] args) {
		System.out.println(binaryGap(8));
	}
	public static int binaryGap(int N) {
		String res = Integer.toBinaryString(N);
		int dist = 0;
		int i = 0;
		int left = -1;
		int right = -1;
		while (i < res.length()) {
			if (res.charAt(i) == '1') {
				if (left != -1) {
					dist = Math.max(dist, i - left);
					left = i;
				}
				else {
					left = i;
				}
			}
			i++;
		}
		return dist;
        
    }
}
