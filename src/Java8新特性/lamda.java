package Java8新特性;

import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月21日 下午8:44:56
* 类说明: 
*/
public class lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("a", "b");
		map.put("b", "c");
		map.put("c", "d");
		
		new Thread(()-> System.err.println("lamda")).start();
		
		
		
	}

}
