import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月18日 下午6:50:50
* 类说明: 
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
        // 首先需要把那些不需要前继课程的课程号，计算出来
        for (int i = 0; i < numCourses; i++) {
        	if (indegree[i] == 0) {
        		order[index] = i; // i 课程不需要前继课程
        		index++;
        		queue.offer(i);
        	}
        }
        // 有多少课程是不需要， 前继课程呢？
        // 做一次BFS
        while (!queue.isEmpty()) {
        	int prenum = queue.poll(); // 假设已经完成 prenum课程
        	for (int i = 0; i < prerequisites.length; i++) {
        		if (prerequisites[i][1] == prenum) {
        			indegree[prerequisites[i][0]]--;
        			// 这门课程 的前继课程学完了
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
