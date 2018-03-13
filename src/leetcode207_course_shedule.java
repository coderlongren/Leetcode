import java.util.LinkedList;
import java.util.Queue;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��11�� ����11:05:32
* ��˵��:  �ο������ϴ����������
*/
public class leetcode207_course_shedule {
	// ��һ�� ʹ�� ���У�BFS��ѭ�����
	 public boolean canFinish(int numCourses, int[][] prerequisites) {
		 if (prerequisites == null) {
			 return false;
		 }
	     // ����֪������������ �γ����� numCourses
		 // ��¼ÿ���γ̵ģ�preRequires
		 int[] courses = new int[numCourses];
		 int len = prerequisites.length;
		 if  (numCourses == 0 || len == 0) {
			 return true;
		 }
		 for (int i = 0; i < len; i++) {
			 // ���� prerequisites[1][0] ��˵�� 1 �ſγ���Ҫ��ǰ�̿γ�, 
			 courses[prerequisites[i][0]]++; 
		 }
		 Queue<Integer> queue = new LinkedList<>(); 
		 for (int i = 0; i < numCourses; i++) {
			 // ˵�� i �ſγ� û��ǰ�̿γ� i�γ̿���ֱ��ѧϰ
			 if (courses[i] == 0) {
				 queue.offer(i);
			 }
		 }
		 
		 // ������һһȡ�������У�����ֱ��ѧϰ�Ŀγ� ��prerequisites �ж�
		 int numNoPre = queue.size();
		 while (!queue.isEmpty()) {
			 int oneNoPrecourse = queue.poll();
			 for (int i = 0; i < len; i++) {
				 // ����γ������ ĳ���γ̵�ǰ�̿γ�
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
	 
	 // �ڶ��� ʹ�� DFS
	 public boolean canFinish2(int numCourses, int[][] prerequisites) {
		return false;
		 
	 }
	 public static void main(String[] args) {
		
	}
}
