import java.util.Arrays;

public class TestArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3};
		int[] b = {1,2,3};
		int[]c  = new int[5];
		System.out.println(Arrays.binarySearch(a, 2));
		System.out.println(Arrays.binarySearch(a, 4));
		Arrays.fill(c, 3);
		for (int i : c) {
			System.out.println(i);
		}
		
		Arrays.sort(a);
		
		
	}	

}
