package 今日头条;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月12日 上午10:30:09
* 类说明: 
*/
public class ggg {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String ii = scanner.nextLine();
		int m = Integer.valueOf(ii);
		String[] input = new String[m];
		Map<num, Integer> map = new HashMap<>();
		List<num> list = new LinkedList<>();
		for (int i = 0; i < m; i++) {
			String line = scanner.nextLine();
			String[] ss = line.split(" ");
			num tempNum =new num(Integer.valueOf(ss[0]), Integer.valueOf(ss[1])); 
			map.put(tempNum, i+1);
			list.add(tempNum);
		}
		list.sort(new Comparator<num>() {

			@Override
			public int compare(num o1, num o2) {
				// TODO Auto-generated method stub
				return o1.start - o2.start;
			}
		});
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			List<num> temp = new LinkedList<>(list);
			temp.remove(i);
			if (safe(temp)) {
				res.add(map.get(list.get(i)));
			}
		}
		System.out.println(res.size());
		res.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
			
		});
		for (int item : res) {
			System.out.print(item + " ");
		}

	}
	public static boolean safe(List<num> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).end > list.get(i + 1).start) {
				return false;
			}
		}
		return true;
	}
}
class num {
	int start = 0;
	int end = 0;
	num(int x, int y) {
		this.start = x;
		this.end = y;
	}
	public num() {
		start = 0;
		end = 0;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public void setStart(int start) {
		this.start = start;
	}
	
}
