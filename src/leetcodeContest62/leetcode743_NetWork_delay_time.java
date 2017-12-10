package leetcodeContest62;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class leetcode743_NetWork_delay_time {
//	static int time = 0;
//	Set<Integer> set = new HashSet<Integer>();
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		 map.put(1, 2);
//		 map.put(2, 2);
//		 System.out.println( map.containsKey(1));
//		 map.remove(1, map.get(1));
//		 System.out.println( map.containsKey(1));
//	}
//	 public static int networkDelayTime(int[][] times, int N, int K) {
//	 
//		 Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		 Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
//		 for (int i = 0; i < times.length; i++){
//			 map.put(times[i][0], times[i][1]);
//		 }
//		 for (int i = 0; i < times.length; i++){
//			 map1.put(times[i][1], times[i][2]);
//		 }
//		 while (!map.keySet().isEmpty()){
//			 if (map.containsKey(K)){
//				 time += map1.get(map.get(K));
//				 K = map.get(K);
//			 }
//			 else {
//				 return -1;
//			 }
//		 }
//		 
//		 return time;
//	 }
	 public int networkDelayTime(int[][] times, int N, int K) {
	        int r = times.length, max = Integer.MAX_VALUE;
	        
	        Map<Integer,List<Integer>> map = new HashMap<Integer, List<Integer>>();
	        for(int i=0;i<r;i++){
	            int[] nums = times[i];
	            int u = nums[0];
	            int v = nums[1];
//	            List<Integer> list = map.getOrDefault(u,new ArrayList<Object>());
	            
	            List<Integer> list = null;
				list.add(i);
	            
	            map.put(u,list);
	        }
	        if(map.get(K) == null){
	            return -1;
	        }
	        int[] dist = new int[N+1];
	        Arrays.fill(dist,max);
	        
	        dist[K] = 0;
	        Queue<Integer> queue = new LinkedList<Integer>();
	        
	        queue.add(K);
	        
	        while(!queue.isEmpty()){
	            int u = queue.poll();
	            int t = dist[u];
	            List<Integer> list = map.get(u);
	            if(list == null)
	                continue;
	            
	            for(int n:list){
	                int v = times[n][1];
	                int time = times[n][2];
	                 if(dist[v] > t + time){
	                    dist[v] = t + time;
	                    queue.add(v);
	                }                
	            }
	        }
	        
	        int res = -1;
	        
	        for(int i=1;i<=N;i++){
	            int d = dist[i];
	            if(d == max){
	                return -1;
	            }
	            res = d > res ? d : res;
	        }
	        
	        return res;
	    }

}
