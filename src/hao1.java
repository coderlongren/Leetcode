import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月28日 下午7:05:55
* 类说明: 
*/
public class hao1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int t = Integer.valueOf(line);
		if (t >= 1) {
			
		}
		String[] lines = new String[t];
		for (int i = 0; i < t; i++) {
			lines[i] = scanner.nextLine();
		}
		for (int i = 0; i < t; i++) {
			String item = lines[i];
			String[] temp = item.split(" ");
			long x = Long.valueOf(temp[0]);
			long k = Long.valueOf(temp[1]);
			System.out.println(kth(x, k));
		}
		
	}
	public static int kth(long x, long k) {
		int y = 1;
		while (k > 0) {
			long temp = x | y;
			if (temp == (x + y)) {
				k--;
			}
			y++;
		}
		return y - 1;
	}
}
