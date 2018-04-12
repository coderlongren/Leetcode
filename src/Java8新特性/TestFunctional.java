package Java8新特性;

import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月8日 下午6:51:21
* 类说明: 
*/
public class TestFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String up = toUpperString((x) -> x.toUpperCase(), "abc");
		System.out.println(up);
		
		Map<String, String> map = new HashMap<>();
		map.put("a", "A");
//		(x, y : map) -> 
	}
	public static String toUpperString (Myfun mf, String string) {
		return mf.getValue(string);
	}

}
