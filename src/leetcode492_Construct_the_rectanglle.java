/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��31�� ����10:25:25
* ��˵��:  Math Question to practice the Class Math---> sqrt()
*/
public class leetcode492_Construct_the_rectanglle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)Math.floor(Math.sqrt(5)));
	}
	 public static int[] constructRectangle(int area) {
		 int x = (int)Math.floor(Math.sqrt(area));
		 while (area%x != 0){
			 // ���� x �ǽ�С������
			 x--;
		 }
		 int[] res = {area/x,x};
		return res;
	        
	 }

}
