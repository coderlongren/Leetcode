package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��2�� ����10:08:12
* ��˵��: 
*/
public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Map.getor);
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 2);
		map.put(2, 3);
//		Map.Entry<Integer, Integer> entry = (Entry<Integer, Integer>) map.entrySet();
		Iterator iterator = map.entrySet().iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}

}
