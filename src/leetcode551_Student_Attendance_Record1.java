/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月9日 上午11:24:45
* 类说明: 
*/
public class leetcode551_Student_Attendance_Record1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	//  需要使用 缺勤计数器 和 迟到计数器吗 我看完全不需要这样做
	public static boolean checkRecord(String s) {
		// 这样是最巧妙的
        return s.indexOf('A') == s.lastIndexOf('A') && s.contains("LLL");
    }
	
	// 第二种最普通的方法 
	public static boolean checkRecord2(String s) {
		int countA = 0; // 缺勤计数器
		int countL = 0; // 迟到计数器
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
