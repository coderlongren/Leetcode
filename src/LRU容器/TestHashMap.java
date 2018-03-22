package LRU容器;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月9日 下午8:10:28
* 类说明: 
*/
public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>(16,0.75f);
//		System.out.println(map.size());
		map.put("redis", 0);
		map.put("java", 1);
		map.put("C", 2);
		Iterator iterator = map.entrySet().iterator();
		System.out.println("LinkedHashMap****************************");
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		HashMap<String, Integer> map2 = new HashMap<>();
		map2.put("redis", 0);
		map2.put("java", 1);
		map2.put("C", 2);
		Iterator iterator2 = map2.entrySet().iterator();
		System.out.println("HashMap*******************************");
		while (iterator2.hasNext()){
			System.out.println(iterator2.next());
		}
		
		
		HashMap<String, Integer> map3 = new LinkedHashMap<>(16,0.75f,true);
		map3.put("redis", 0);
		map3.put("java", 1);
		map3.put("C", 2);
		int a = map3.get("C");
		int b = map3.get("redis");
		Iterator iterator3 = map3.entrySet().iterator();
		System.out.println("LinkedHashMap*************增加了构造参数******************");
		while (iterator3.hasNext()){
			System.out.println(iterator3.next());
		}
	}

}
