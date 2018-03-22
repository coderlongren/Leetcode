package 美团笔试;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月22日 下午8:27:35
* 类说明: 
*/
public class 笔试2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		
		if (!S.contains("1")) {
			System.out.println(1);
		}
		else if (!S.contains("2")) {
			System.out.println(2);
		}
		else if (!S.contains("3")) {
			System.out.println(3);
		}
		else if (!S.contains("4")) {
			System.out.println(4);
		}
		else if (!S.contains("5")) {
			System.out.println(5);
		}
		else if (!S.contains("6")) {
			System.out.println(6);
		}
		else if (!S.contains("7")) {
			System.out.println(7);
		}
		else if (!S.contains("8")) {
			System.out.println(8);
		}
		else if (!S.contains("9")) {
			System.out.println(9);
		}
		// 现在包含了 123456789
		else {
			if (!S.contains("0")) {
				System.out.println(10);
			}
			// 0 - 9q 全部都有了
			else {
				Map<Character, Integer> map = new HashMap<>();
				for (Character c : S.toCharArray()) {
					if (map.keySet().contains(c)) {
						map.put(c, map.get(c) + 1);
					}
					else {
						map.put(c, 1);
					}
				}
				for (int i = 1; i < 100; i++) {
					boolean flag = true;
					for (char c = '1'; c <= '9'; c++) {
						if (map.get(c) == i) {
							String temp = "";
							for (int k = 0; k <= i; k++) {
								temp =temp + c;
							}
							System.out.println(temp);
							flag = false;
							break;
						}
						if (map.get(c) == i && map.get(c) - map.get("0") >= 2) {
							String temp = "";
							for (int k = 0; k <= i; k++) {
								temp =temp + c;
							}
							System.out.println(temp);
							flag = false;
							break;
						}
					}
					if (!flag) {
						break;
					}
				}
			}
			
		}
		
		
		
	}
}
