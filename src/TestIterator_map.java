import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��13�� ����3:05:31
* ��˵��: 
*/
public class TestIterator_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("sailong", 20);
		map.put("wenge", 21);
		map.put("yake", 22);
		// ��һ�ֵ����ķ�ʽ 
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()){
			String string = iterator.next();
			System.out.println("key:" + string + " value:" + map.get(string));
		}
		
		System.out.println("�����ķָ���----------------------------");
//		Set<E> entry = map.entrySet()
//		java.util.Map.Entry<String, Integer> map
		Iterator iterator2 = map.entrySet().iterator();
		while (iterator2.hasNext()){
			Map.Entry entry = (java.util.Map.Entry) iterator2.next();
			System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
		}
		
		
	}

}
