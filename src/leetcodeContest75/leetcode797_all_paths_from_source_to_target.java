package leetcodeContest75;

import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月11日 上午10:42:48
* 类说明: 
*/
public class leetcode797_all_paths_from_source_to_target {
	 // 让我们用回溯法 来解决此题
	 public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
	        List<List<Integer>> res = new ArrayList<>();
	        if (graph == null) {
	        	return res;
	        }
	        ArrayList<Integer> list = new ArrayList<>();
	        backtrack(res, list, 0, graph.length - 1,graph);
	        return res;
	  }
	 public static void backtrack(List<List<Integer>> res, ArrayList<Integer> list, int start, int end,int[][] graph) {
		 // 找打了一条到达终点的路径
		 if (start == end) {
			 list.add(start);
			 res.add(new ArrayList<>(list));
			 list.remove(list.size() - 1); 
			 return;
		 }
		 for (int next:graph[start]) {
			 list.add(start);
			 backtrack(res, list, next, end, graph);
			 list.remove(list.size() - 1);
		 }
	 }
	 public static void main(String[] args) {
		int[][] graph = {{1,2},{3},{3},{}};
		System.out.println(allPathsSourceTarget(graph));
		//[[0, 1, 3], [0, 2, 3]]
	}
}
