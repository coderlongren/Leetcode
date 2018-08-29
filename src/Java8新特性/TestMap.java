package Java8新特性;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月24日 下午9:55:56
* 类说明: 
*/
public class TestMap {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		Integer sum = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);
		List<String> reStrings = new ArrayList<>();
		reStrings = list.stream().map(num -> num + "" + ",").collect(Collectors.toList());
		System.out.println(reStrings.toString());
	}
}
