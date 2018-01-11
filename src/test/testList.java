package test;

import java.util.LinkedList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月11日 下午5:18:04
* 类说明: 
*/
public class testList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		List<String> list =  new LinkedList<>();
		List<String> list2 = new LinkedList<>();
		System.out.println(list.getClass() == list2.getClass());
//		list.add("a");
//		list.add("b");
//		list.add(3);
	}

}
