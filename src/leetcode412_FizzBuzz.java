import java.util.LinkedList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月14日 下午7:34:48
* 类说明: 
*/
public class leetcode412_FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public List<String> fizzBuzz(int n) {
		 List<String> result = new LinkedList<>();
		 for (int i = 1; i <= n; i++){
			 if (i%3 == 0 && i%5 == 0){
				 result.add("FizzBuzz");
			 }
			 else if (i%3 == 0){
				 result.add("Fizz");
			 }
			 else if (i%5 == 0){
				 result.add("Buzz");
			 }
			 else {
				 result.add(i + "");
			 }
		 }
		 return result;
	 }

}
