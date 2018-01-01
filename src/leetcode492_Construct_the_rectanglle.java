/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月31日 上午10:25:25
* 类说明:  Math Question to practice the Class Math---> sqrt()
*/
public class leetcode492_Construct_the_rectanglle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)Math.floor(Math.sqrt(5)));
	}
	 public static int[] constructRectangle(int area) {
		 int x = (int)Math.floor(Math.sqrt(area));
		 while (area%x != 0){
			 // 保持 x 是较小的因子
			 x--;
		 }
		 int[] res = {area/x,x};
		return res;
	        
	 }

}
