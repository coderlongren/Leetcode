package 一八年校招题目;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class zhihu2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String[] inputs = input.split(" ");
		List<Integer> list = new ArrayList<>();
		for (String item : inputs) {
			if (item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/")) {
				int num1 = list.get(0);
				int num2 = list.get(1);
				int res = 0;
				if (item.equals("+")) {
						res = num1 + num2;
				}
				else if (item.equals("-")) {
					res = num1 - num2;
				}
				else if (item.equals("*")) {
					res = num1 * num2;
				}
				else {
					res = num1 / num2;
				}
				list.clear();
				list.add(res);
			}
			else {
				list.add(Integer.valueOf(item));
			}
		}
		System.out.print(list.get(0));
		
	}
}
