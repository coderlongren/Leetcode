package Java8������;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��16�� ����10:26:04
* ��˵��: 
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
