package lanqiao.org;
public class 纸牌屋 {
	static int count;
	
	// 旋转的形状还是相同的
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9};
		dfs(a,0);
		System.out.println(count/6);
		
	}
	// 标准的DFS
	public static void dfs(int[] a,int begin){
		if (begin >= 9){
			if (check(a)){
				count++;
			}
			return;
		}
		
		for (int i = begin; i < a.length; i++){
			int temp  = a[begin];
			a[begin] = a[i];
			a[i] = temp;
			
			dfs(a,begin + 1);
			
			temp = a[begin];
			a[begin] = a[i];
			a[i] = temp;
		}
	} 
	// 核查是否 满足三角形条件
	public static boolean check(int[] a){
		int[] b = new int[3];
		b[0] = a[0] + a[1] + a[2] + a[3];
		b[1] = a[3] + a[4] + a[5] + a[6];
		b[2] = a[6] + a[7] + a[8] + a[0];
		if (b[0] == b[1] && b[1] == b[2]){
			return true;
		}
		else {
			return false;
		}
		
	}
	

}
