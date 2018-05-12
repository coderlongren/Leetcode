import java.util.Arrays;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��5��8�� ����9:02:30
* ��˵��: 
*/
public class leetcode785_Is_Graph_bitpartile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// ��������� Ⱦɫ����
	public static boolean isBipartite(int[][] graph) {
		int n = graph.length;
		int[] colors = new int[n]; // ��¼ÿ���ߵ� Ⱦɫ���
		Arrays.fill(colors, -1);
		
		for (int i = 0; i < n; i++) {
			if (colors[i] == -1 && !dfs(graph, i, 0, colors)) {
				return false;
			}
		}
		return true;
	}
	public static boolean dfs(int[][] graph, int i, int color, int[] colors) {
		if (colors[i] != -1) { // �Ѿ�����ɫ��
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
