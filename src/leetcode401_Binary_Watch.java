import java.util.ArrayList;
import java.util.List;

public class leetcode401_Binary_Watch {

	// 可以使用 回溯法解决此问题
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.bitCount(5));
		System.out.println(readBinaryWatch(3));
	}
	 public static List<String> readBinaryWatch(int num) {
		List<String> res = new ArrayList<String>();
		for (int i = 0; i < 12; i++){
//			Integer.bitCount(i);
			for (int j = 0;j < 60; j++){
				if ((i + j) == num){
					String temp = String.format("%d:%2d", i,j);
					res.add(temp);
				}
			}
		}
		return res;
	 }
//	 public static 

}
