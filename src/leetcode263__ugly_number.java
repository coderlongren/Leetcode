
public class leetcode263__ugly_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// ������ ֻ���� 2 ��3 ��5
	// ��Ҫ˼�� ���Ƿ��η� 
	public static boolean isUgly(int num) {
		if (num == 0){
			return false;
		}
		if (num == 1){
			return true;
		}
		while (num%2 == 0){
			num /=2 ;
		}
		while (num%3 == 0){
			num /=3 ;
		}
		while (num%5 == 0){
			num /=5 ;
		}
		return num == 1;
	}
}
