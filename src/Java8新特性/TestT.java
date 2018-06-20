package Java8新特性;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月16日 下午10:26:04
* 类说明: 
*/
public class TestT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
//		List<Number> list2 = list;
//		List<? extends Number> foo3 = new ArrayList<? extends Double>();
		List<? extends Object> l2 = new ArrayList<>();
		Object object = new Object();
		String string = "ddd";
//		l2.add(string);
//		Collections.copy(dest, src);
	}

}
