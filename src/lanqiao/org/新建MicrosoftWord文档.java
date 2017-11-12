package lanqiao.org;

import java.util.Scanner;

public class ÐÂ½¨MicrosoftWordÎÄµµ {
	static int[] time = new int[2013];
	static String[] res = new String[2013];
	static int j = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		String huanhang = scanner.nextLine();
//		for (int i = 0; i < time.length; i++){
//			System.out.print(time[i]);
//		}
		for (int i = 0; i < x; i++){
			String one = scanner.nextLine();
			
			if(one.equals("New")){
				New();
			}
			else{
				int num = one.charAt(7) - '0';
				Delete(num - 1);
			}
		}
		for (int i = 0; i < x; i++){
			System.out.println(res[i]);
		}
	}
	public static void New(){
		for (int i = 0; i < time.length; i++){
			if (time[i] == 0){
				time[i] = 1;
				res[j++] = i + 1 + "";
//				System.out.println(i + 1);
				break;
			}
			
		}
	}
	public static void Delete(int num){
		if (time[num] == 1){
			time[num] = 0;
			res[j++] = "Successful";
		}
		else{
			res[j++] = "Failed";
//			System.out.println("Failed");
		}
	}

}
