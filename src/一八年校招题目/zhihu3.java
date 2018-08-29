package 一八年校招题目;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月25日 下午7:46:49
* 类说明: 
*/
public class zhihu3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(1);
		Collections.sort(list, (a, b) -> a.compareTo(b));
	}
}
