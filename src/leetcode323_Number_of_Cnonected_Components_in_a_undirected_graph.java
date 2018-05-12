import java.util.ArrayList;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��5��1�� ����5:32:20
* ��˵��: 
*/
public class leetcode323_Number_of_Cnonected_Components_in_a_undirected_graph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] edges = {{0,1}, {1,2}, {3,4}};
		System.out.println(countComponents(5, edges));
	}
	// DFS + ���鼯 
	 public static int countComponents(int n, int[][] edges) {  
		 if (edges == null || edges.length < 2 || edges[0].length == 0) {
			 return 0;
		 }
		 // �Ƚ���һ�� ���� ����ʾ ����ͼ
		 List[] graphs = new List[n];
		 for (int i = 0; i < graphs.length; i++) {
			 graphs[i] = new ArrayList<>();
		 }
		 for (int[] edge : edges) {
			 graphs[edge[0]].add(edge[1]);
			 graphs[edge[1]].add(edge[0]);
		 }
		 int res = 0;
		 boolean[] visit = new boolean[n];
		 for (int i = 0; i < n; i++) {
			 if (!visit[i]) { // Ĭ��DFSһ�� ���һ����ͨ��֧�ڵ����� ȫ����Ϊ visit[i] = true
				 res++;
				 dfs(graphs, visit, i);
			 }
		 }
		 return res;
		 	
	 }
	 public static void dfs(List<Integer>[] graphs, boolean[] visit, Integer i) {
		 if (visit[i]) {
			 return;
		 }
		 visit[i] = true;
		 for (int j = 0; j < graphs[i].size(); j++) {
			dfs(graphs, visit, graphs[i].get(j));
		 }
		 
	 }
}
