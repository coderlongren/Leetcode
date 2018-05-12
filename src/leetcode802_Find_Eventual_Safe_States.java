import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.IsInstanceOf;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月9日 上午10:34:00
* 类说明: 
*/
public class leetcode802_Find_Eventual_Safe_States {
	// 这道题 还是使用 染色法来做
	public static List<Integer> eventualSafeNodes(int[][] graph) {
		// 0: 没有 color
		// 1 : safe 
		// 2 : unsafe
		
		// 默认都是 没有颜色的
		int[] colors = new int[graph.length];
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < graph.length; i++) {
			if (dfs(graph, i, colors)) {
				res.add(i);
			}
		}
		return res;
		
	}
	public static boolean dfs(int[][] graph, int color, int[] colors) {
		// 如果 这点已经有颜色了
		if (colors[color] != 0) {
			return colors[color] == 1; // 看他是否 safe
		}
		// 先把这点 置为不安全，只有他的后继节点都安全， 才把他置为安全
		colors[color] = 2;
		for (int color_next : graph[color]) {
			if (!dfs(graph, color_next, colors)) {
				return false;
			}
		}
		colors[color] = 1;
		return true;
		
	}
	 public static void main(String[] args) {
		int[][] graph = {{1,2},{2,3},{5},{0},{5},{},{}};
		System.out.println(eventualSafeNodes(graph));
	}
}
