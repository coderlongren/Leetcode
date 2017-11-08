package lanqiao.org;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1000; i <= 9999;i++){
			int a = i%10;
			int b = i/10%10;
			int c = i/100%10;
			int d = i/1000;
			if (a == d && b == c){
				System.out.println(i);
			}
		}
	}

}
