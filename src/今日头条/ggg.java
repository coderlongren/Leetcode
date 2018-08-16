package 今日头条;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
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
		List<num> list = new LinkedList<>();
		for (int i = 0; i < m; i++) {
			String line = scanner.nextLine();
			String[] ts = line.split(";");
			for (String item : ts) {
				String[] ss = item.split(",");
				list.add(new num(Integer.valueOf(ss[0]), Integer.valueOf(ss[1])));
			}
		}
		list.sort(new Comparator<num>() {

			@Override
			public int compare(num o1, num o2) {
				// TODO Auto-generated method stub
				return o1.start - o2.start;
			}
		});
//		for (num item : list) {
//			System.out.println(item.start + "," + item.end);
//		}
		List<num> res = new LinkedList<>();
		num test = null;
		for (num item : list) {
			if (test == null || test.end < item.start) {
				res.add(test);
				test = item;
			}
			else {
				test.end = Math.max(test.end, item.end);
			}
		}
		res.add(test);
		res.remove(0);
		int i = 0;
		for (num item : res) {
			if (i == res.size() - 1) {
				System.out.print(item.start + "," + item.end);
			}else {
				System.out.print(item.start + "," + item.end + ";");
			}
			i++;
		}
		
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
