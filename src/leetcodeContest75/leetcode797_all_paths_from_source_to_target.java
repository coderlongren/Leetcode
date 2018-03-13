package leetcodeContest75;

import java.util.ArrayList;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��11�� ����10:42:48
* ��˵��: 
*/
public class leetcode797_all_paths_from_source_to_target {
	 // �������û��ݷ� ���������
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
		 // �Ҵ���һ�������յ��·��
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
