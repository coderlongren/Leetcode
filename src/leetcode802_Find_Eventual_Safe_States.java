import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.IsInstanceOf;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��5��9�� ����10:34:00
* ��˵��: 
*/
public class leetcode802_Find_Eventual_Safe_States {
	// ����� ����ʹ�� Ⱦɫ������
	public static List<Integer> eventualSafeNodes(int[][] graph) {
		// 0: û�� color
		// 1 : safe 
		// 2 : unsafe
		
		// Ĭ�϶��� û����ɫ��
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
		// ��� ����Ѿ�����ɫ��
		if (colors[color] != 0) {
			return colors[color] == 1; // �����Ƿ� safe
		}
		// �Ȱ���� ��Ϊ����ȫ��ֻ�����ĺ�̽ڵ㶼��ȫ�� �Ű�����Ϊ��ȫ
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
