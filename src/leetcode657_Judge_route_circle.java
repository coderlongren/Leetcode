/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��12�� ����2:50:33
* ��˵��: 
*/
public class leetcode657_Judge_route_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static boolean judgeCircle(String moves) {
        if (moves == null || moves.length() == 0){
        	return true;
        }
        int lr = 0;
        int ud = 0;
        for (Character character : moves.toCharArray()) {
			if (character == 'U'){
				ud++;
			}
			else if (character == 'D'){
				ud--;
			}
			else if (character == 'L'){
				lr--;
			}
			else {
				lr++;
			}
		}
        return lr == 0 && ud == 0;
    }

}
