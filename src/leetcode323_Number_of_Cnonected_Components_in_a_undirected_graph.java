import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月1日 下午5:32:20
* 类说明: 
*/
public class leetcode323_Number_of_Cnonected_Components_in_a_undirected_graph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] edges = {{0,1}, {1,2}, {3,4}};
		System.out.println(countComponents(5, edges));
	}
	// DFS + 并查集 
	 public static int countComponents(int n, int[][] edges) {  
		 if (edges == null || edges.length < 2 || edges[0].length == 0) {
			 return 0;
		 }
		 // 先建立一个 链表 来表示 无向图
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
			 if (!visit[i]) { // 默认DFS一次 会把一个连通分支内的数据 全部置为 visit[i] = true
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
