/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��9�� ����11:24:45
* ��˵��: 
*/
public class leetcode551_Student_Attendance_Record1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	//  ��Ҫʹ�� ȱ�ڼ����� �� �ٵ��������� �ҿ���ȫ����Ҫ������
	public static boolean checkRecord(String s) {
		// �������������
        return s.indexOf('A') == s.lastIndexOf('A') && s.contains("LLL");
    }
	
	// �ڶ�������ͨ�ķ��� 
	public static boolean checkRecord2(String s) {
		int countA = 0; // ȱ�ڼ�����
		int countL = 0; // �ٵ�������
		for (Character character : s.toCharArray()) {
			if (character == 'A'){
				countA++;
				if (countA > 1){
					return false;
				}
				countL = 0;
			}
			else if (character == 'L'){
				countL++;
				if (countL > 2){
					return false;
				}
			}
			else {
				countL = 0;
			}
		}
		return true;
		
	}

}
