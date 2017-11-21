package AlgortithmDesign;
public class batch_Works {

	/**
	 * @param batch works is doing
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	// 
	public static int Flow(int[][] M,int n,int[] bestx){
//		int ub 
		return 1;
	}
	// Swap function
	public static void Swap(int i,int j){
		int temp = i;
		i = j;
		j = temp;
	}
	public static class Flowshop{
		public int[][] M;// time of every work
		public int[] x;// current work
		public int[] bestx;// current best work
		public int[] f2;// mechine2 complete time
		public int f1;// mechine1 complete time
		public int f;// sum time of complete
		public int bestf;// current best
		public int n;//works number
		public void BackTrack(int i){// aligorithm backtrack
			
			// first work
			if (i > n){
				for (int j = 1; j <= n;j++){
					bestx[j] = x[j];
					bestf = f;
				}
			}
			// if not
			else {
				for (int j = i; j <= n; j++){
					f1 += M[x[j]][1];
					f2[i] = ((f2[i - 1] > f1)? f2[i - 1]:f1) + M[x[j]][2];
					f +=f2[i];
					
					if (f < bestf){
						// different swap 
						Swap(x[i],x[j]);
						BackTrack(i + 1);
						Swap(x[i], x[j]);
					}
					f1 -= M[x[j]][1];
					f -= f2[i];
					
				}
			}
		}
		
	}
	

}
