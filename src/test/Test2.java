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
	// ������
	public static int test(String string){
		// arrayList ��vector�ĵײ���һ���ģ����ǻ��ڶ�̬�����
		List<Character> list = new  ArrayList<Character>();
		string = string.trim();// ȥ����β�Ŀո�
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
		// ѭ���������е�Ԫ��
		int i = 0;
		while (i < list.size()){
			// ��������ַ��������,Сд��Ϊ��д
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
			// �����ֵ������
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
