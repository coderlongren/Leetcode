package ţ��coder;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��16�� ����7:13:57
* ��˵��:  �����Ŀ ��ֱ�ڶ��ң� ֱ��˵4 ����7 ���������� ���Ӵ�ë�߰��� ����Ľ��Ǵ�ģ�
*/
public class �������� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		char[] chars = s.toCharArray();
		int start = 0;
		int end = 0;
		boolean flag = false;
		List<String> list = new ArrayList<>();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < chars.length; i++) {
			if ((chars[i] == '4' || chars[i] == '7') && !flag) {
				start = i;
				flag = true;
				buffer.append(chars[i]);
				continue;
			}
			
			if (flag) {
				if ((chars[i] == '4' || chars[i] == '7')) {
					buffer.append(chars[i]);
				}
				else {
					list.add(buffer.toString());
					buffer.delete(0, buffer.length());
					flag = false;
				}
			}
		}
		list.add(buffer.toString());
		
		Map<String, Integer> map = new HashMap<>();
		for (String temp : list) {
			ArrayList<String> list2 = new ArrayList<>();
			backtrack(temp, 0, new StringBuffer(), list2);
			
			for (String ss : list2) {
				System.out.println(ss);
			}
		}
		
	}
	
	public static void backtrack(String string, int start,StringBuffer stringBuffer, List<String> res) {
		for (int i = start; i < string.length(); i++) {
			stringBuffer.append(string.charAt(i));
			res.add(stringBuffer.toString());
			backtrack(string, start + 1, stringBuffer, res);
			stringBuffer.deleteCharAt(stringBuffer.length() - 1);
		}
	}
	
}
