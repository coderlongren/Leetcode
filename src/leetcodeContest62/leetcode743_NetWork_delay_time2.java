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
import java.util.function.IntPredicate;

public class leetcode743_NetWork_delay_time2 {
	public static void main(String[] args){
//		 	int[][] table = new int[2][2];
//	        for(int[] ele:table){
//	            Arrays.fill(ele,Integer.MAX_VALUE);
//	        }
//	        System.out.println("sdfsd");
		int N = 4;
		int K = 2;
		int[][] times = {{2,1,1},{2,3,2},{1,4,4}};
		System.out.println(networkDelayTime(times, N, K));
	}
	
	 public static int networkDelayTime(int[][] times, int N, int K) {
	        int[][] table = new int[N+1][N+1];
	        for(int[] ele:table){
	            Arrays.fill(ele,Integer.MAX_VALUE);
	        }
	        
	        for(int[] ele:times){
	            table[ele[0]][ele[1]] = ele[2];
	        }
	        
	        Queue<Integer> queue = new LinkedList<>();
	        int[] dis = new int[N+1];
	        Arrays.fill(dis,Integer.MAX_VALUE);
	        // dis[] 保存的是从K到 任意一个点的路径
	        dis[K]=0;
	        queue.offer(K);
	        while(queue.size()!=0){
	            int popEle = queue.poll();
	            for(int i=1;i<=N;i++){
	                if(table[popEle][i]!=Integer.MAX_VALUE && dis[popEle]!=Integer.MAX_VALUE){
	                     if(table[popEle][i]+dis[popEle]<dis[i]){
	                         dis[i] = table[popEle][i] + dis[popEle];
	                         queue.offer(i);
	                     }
	                }
	                
	            }
	        }
	        int max = 0;
	        for(int i=1;i<=N;i++){
	        	// 能否够到达这个点 
	            if(dis[i]==Integer.MAX_VALUE){
	                return -1;
	            }else{
	                max = Math.max(dis[i],max);
	            }
	        }
	        return max;
	    }
}
