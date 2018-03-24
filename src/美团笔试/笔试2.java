package 美团笔试;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月22日 下午8:27:35
* 类说明:  修改之后AC 的美团笔试题2 穷举法
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
				int min = 1;
				String res = "";
				
				for (char c = '1'; c <= '9'; c++) {
					min = Math.min(min, map.get(c));
				}
				for (char c = '1'; c <= '9'; c++) {
					boolean flag = true;
					if (map.get(c) == min) {
						if (map.get(c) - map.get('0') >= 1) {
							res += c;
							for (int i = 1; i <= map.get('0') + 1; i++) {
								res += "0";
								flag = false;
								break;
							}
						}
						else {
							for (int i = 1; i <= map.get(c) + 1; i++) {
								res += c;
							}
							flag = false;
							break;
						}
					}
					if (!flag) {
						break;
					}
					
					
				}
				
				System.out.println(res);
			}
			
		}
		
		
		
	}
}
