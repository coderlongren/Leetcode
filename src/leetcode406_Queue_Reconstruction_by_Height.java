import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月22日 下午12:59:16
* 类说明: 
*/
public class leetcode406_Queue_Reconstruction_by_Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
		System.out.println(reconstructQueue(people));
	}
	 public static int[][] reconstructQueue(int[][] people) {
		 Arrays.sort(people, new Comparator<int[]>() {
	            public int compare(int[] person1, int[] person2) {
	                return (person1[0] == person2[0]) ? person1[1] - person2[1] : person2[0] - person1[0];
	            }
	        });
	        List<int[]> list = new ArrayList<int[]>();
	        for (int[] cur : people) {
	            list.add(cur[1], cur);
	        }
	        return list.toArray(new int[people.length][2]);
		
	 }
	 public static int[][] reconstructQueue2(int[][] people) {
	        List<int[]> res = new ArrayList<>();
	        
	        Queue<int[]> pq = new PriorityQueue<>((a,b)->{
	            if(a[0] != b[0]) return b[0] - a[0];
	            else return a[1]-b[1];
	        });
	        
	        for(int[] p : people){
	            pq.offer(p);
	        }
	        
	        while(!pq.isEmpty()){
	            int[] p = pq.poll();
	            res.add(p[1], p);
	        }
	        return (int[][]) res.toArray(new int[0][]);
	    }
}
