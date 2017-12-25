package test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println((char)(65));
		List<Character> list = new LinkedList<Character>();
		list.add('a');
		list.add('b');
		list.add('c');
		list.remove(1);
		list.add(1,'b');
		System.out.println(list);
		
		String string = "   abc   abc as99   ";
		System.out.println(string.length());
		test(string);
	
		
	}
	// 串处理
	public static int test(String string){
		// arrayList 和vector的底层是一样的，都是基于动态数组的
		List<Character> list = new  ArrayList<Character>();
		string = string.trim();// 去掉首尾的空格
		char[] array = string.toCharArray();
		for (int i = 0; i < array.length; i++){
			list.add(array[i]);
		}
		for (int i = 0; i < list.size(); i++){
			
			if (list.get(i) == ' ' && (i + 1) < list.size() && list.get(i + 1) == ' '){
				list.remove(i);
				i--;
			}
		}
		// 循环遍历所有的元素
		int i = 0;
		while (i < list.size()){
			// 如果是首字符的情况下,小写变为大写
			if (i == 0 && list.get(i) <= 'z' && list.get(i) >= 'a'){
				char c = list.get(i);
				list.remove(i);
				list.add(i,(char)(c - 32));
//				list.add(arg0, arg1)
				i++;
			}
			else if (list.get(i) == ' '){
				i++;
			}
			else if (list.get(i) <= 'z' && list.get(i) >= 'a' && list.get(i - 1) == ' '){
				char c = list.get(i);
				list.remove(i);
				list.add(i,(char)(c - 32));
//				list.add(arg0, arg1)
				i++;
			}
			// 是数字的情况下
			else if (list.get(i) >= '0' && list.get(i) <= '9' && list.get(i - 1) <= 'z' && list.get(i - 1) >= 'a'){
				
				list.add(i,'_');
				i = i + 2;
			}
			else {
				i++;
			}
		}
		System.out.println(list.toString());
		
		return 1;
	}

}
