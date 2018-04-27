import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��18�� ����6:50:50
* ��˵��: 
*/
public class leetcode210_Course_Schedule2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (prerequisites == null || numCourses == 0) {
        	return null;
        }
        int[] indegree = new int[numCourses];
        int[] order = new int[numCourses];
        int index = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < prerequisites.length; i++) {
        	indegree[prerequisites[i][0]]++;
        }
        // ������Ҫ����Щ����Ҫǰ�̿γ̵Ŀγ̺ţ��������
        for (int i = 0; i < numCourses; i++) {
        	if (indegree[i] == 0) {
        		order[index] = i; // i �γ̲���Ҫǰ�̿γ�
        		index++;
        		queue.offer(i);
        	}
        }
        // �ж��ٿγ��ǲ���Ҫ�� ǰ�̿γ��أ�
        // ��һ��BFS
        while (!queue.isEmpty()) {
        	int prenum = queue.poll(); // �����Ѿ���� prenum�γ�
        	for (int i = 0; i < prerequisites.length; i++) {
        		if (prerequisites[i][1] == prenum) {
        			indegree[prerequisites[i][0]]--;
        			// ���ſγ� ��ǰ�̿γ�ѧ����
        			if (indegree[prerequisites[i][0]] == 0) {
        				order[index] = prerequisites[i][0];
        				index++;
        				queue.offer(prerequisites[i][0]);
        				
        			}
        		}
        	}
        	 
        }
        
        if (index == numCourses) {
        	return order;
        }
        else {
        	return new int[0];
        }
    }

}
