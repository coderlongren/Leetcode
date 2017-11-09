import java.util.Scanner;

public class leetcode693_BinaryNumberWithAlternate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasAlternatingBits(10));
	}
	public static boolean hasAlternatingBits(int n) {
		String result = Integer.toBinaryString(n);
		for (int i = 0; i < result.length() - 1 ;i++){
			if (result.charAt(i) == result.charAt(i + 1)){
				return false;
			}
		}
        return true;
    }
}
