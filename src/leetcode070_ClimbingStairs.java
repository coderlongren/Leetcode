import java.lang.management.MemoryType;

public class leetcode070_ClimbingStairs {

	public static void main(String[] args) {
		System.out.println(climbingStairs(3));
	}
	public static int climbingStairs(int n){
		int[] memory = new int[n + 1];
		return stair(0,n,memory);
	}
	public static int stair(int i,int n,int[] memory){
		if (i > n){
			return 0;
		} 
		else if (i == n){
			return 1;
		}
		if (memory[i] > 0){
			return memory[i];
		}
		memory[i] = stair(i + 1, n, memory) + stair(i + 2, n, memory);
		return memory[i];
	}

}
