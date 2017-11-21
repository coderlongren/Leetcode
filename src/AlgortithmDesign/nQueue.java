package AlgortithmDesign;
import java.util.Scanner;
public class nQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Queue queue = new Queue();
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input the number of queue?");;
		int n = scanner.nextInt();
		queue.n = n;
		queue.sum = 0;
		int[] x = new int[n + 1];
		for (int i = 0; i <= n;i++){
			x[i] = i;
		}
		queue.x = x;
		queue.BackTrack(1);
		System.out.println("possible action is  " + queue.sum);
	}
	public static class Queue{
		public int n;//the count of queue
		public int[] x;//current result
		public long sum;//current count result
		public void BackTrack(int t){
			
			if (t > n){
				sum++;
			}
			else {
				for (int i = 1; i <= n; i++){
					x[t] = i;
					if (Place(t)){
						BackTrack(t + 1);
					}
				}
			}
		}
		public boolean Place(int k){
			for (int j = 1; j < k;j++){
				if (Math.abs(Math.abs(k - j)) == Math.abs(x[j] - x[k]) || x[j] == x[k]){
					return false;
				}
			}
			return true;
		}
		
		
	}
//	public static boolean Place(int k){
//		for (int j = 1; j < k;j++){
//		}
//	}

}
