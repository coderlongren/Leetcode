package Java8������;

import java.util.HashMap;
import java.util.Map;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��21�� ����8:44:56
* ��˵��: 
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
