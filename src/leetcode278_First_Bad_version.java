/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��12�� ����7:40:34
* ��˵��: 
*/
public class leetcode278_First_Bad_version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int firstBadVersion(int n) {
	      int start = 1;
	      int end = n;
		 while (start < end){
			 int mid = (start + end)/2;
			 if (isBadVersion(mid)){
				 end = mid;
			 }
			 else {
				 start  = mid + 1;
			 }
		 }
		 return start;
	 }
	private static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		
		// �շ���
		return false;
	}

}
