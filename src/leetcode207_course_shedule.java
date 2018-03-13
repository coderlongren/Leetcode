import java.util.LinkedList;
import java.util.Queue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月11日 上午11:05:32
* 类说明:  参考的网上大神的做法，
*/
public class leetcode207_course_shedule {
	// 第一种 使用 队列，BFS，循环检查
	 public boolean canFinish(int numCourses, int[][] prerequisites) {
		 if (prerequisites == null) {
			 return false;
		 }
	     // 至少知道如何利用这个 课程数量 numCourses
		 // 记录每个课程的，preRequires
		 int[] courses = new int[numCourses];
		 int len = prerequisites.length;
		 if  (numCourses == 0 || len == 0) {
			 return true;
		 }
		 for (int i = 0; i < len; i++) {
			 // 假设 prerequisites[1][0] 就说明 1 号课程需要有前继课程, 
			 courses[prerequisites[i][0]]++; 
		 }
		 Queue<Integer> queue = new LinkedList<>(); 
		 for (int i = 0; i < numCourses; i++) {
			 // 说明 i 号课程 没有前继课程 i课程可以直接学习
			 if (courses[i] == 0) {
				 queue.offer(i);
			 }
		 }
		 
		 // 下面在一一取出队列中，可以直接学习的课程 对prerequisites 判断
		 int numNoPre = queue.size();
		 while (!queue.isEmpty()) {
			 int oneNoPrecourse = queue.poll();
			 for (int i = 0; i < len; i++) {
				 // 这个课程如果是 某个课程的前继课程
				 if (prerequisites[i][1] == oneNoPrecourse) {
					 courses[prerequisites[i][0]]--;
					 if (courses[prerequisites[i][0]] == 0) {
						 numNoPre++;
						 queue.offer(prerequisites[i][0]);
					 }
				 }
			 }
		 }
		 
		 if (numNoPre == numCourses) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 // 第二种 使用 DFS
	 public boolean canFinish2(int numCourses, int[][] prerequisites) {
		return false;
		 
	 }
	 public static void main(String[] args) {
		
	}
}
