import java.util.Arrays;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月8日 下午9:02:30
* 类说明: 
*/
public class leetcode785_Is_Graph_bitpartile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 大神给出了 染色法。
	public static boolean isBipartite(int[][] graph) {
		int n = graph.length;
		int[] colors = new int[n]; // 记录每条边的 染色情况
		Arrays.fill(colors, -1);
		
		for (int i = 0; i < n; i++) {
			if (colors[i] == -1 && !dfs(graph, i, 0, colors)) {
				return false;
			}
		}
		return true;
	}
	public static boolean dfs(int[][] graph, int i, int color, int[] colors) {
		if (colors[i] != -1) { // 已经有颜色了
			return colors[i] == color;
		}
		colors[i] = color;
		for (int j : graph[i]) {
			if (!dfs(graph, j, 1 - color, colors)) {
				return false;
			}
		}
		return true;
	}
}
