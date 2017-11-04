package lanqiao.org;

import java.util.Scanner;

public class shiliuToShi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		int len = n.length();
		long result = 0;
		if (len == 1){
			if (n.charAt(0) >= 'A'){
				result = n.charAt(0) - '0' - 7;
			}
			else {
				result = n.charAt(0) - '0';
			}
		}
		else {
			for (int i = 0; i < len; i++){
				if (n.charAt(i) >= 'A'){
					result += (n.charAt(i) - '0' - 7)*Math.pow(16, len - i - 1);
				}
				else {
					result += (n.charAt(i) - '0')*Math.pow(16, len - i - 1);
				}
			}
		}
		System.out.println(result);
	}

}
