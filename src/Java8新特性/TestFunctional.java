package Java8������;

import java.util.HashMap;
import java.util.Map;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��8�� ����6:51:21
* ��˵��: 
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
