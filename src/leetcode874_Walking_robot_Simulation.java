import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年7月22日 下午9:41:04
* 类说明: 
*/
public class leetcode874_Walking_robot_Simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] commands = {4,-1,4,-2,4};
		int[][] obstacles = {{2,4}};
		System.out.println(robotSim(commands, obstacles));
	}
	public static int robotSim(int[] commands, int[][] obstacles) {
        int max = Integer.MIN_VALUE;
        Map<Integer, int[]> dir = new HashMap<>();
        Map<Integer, int[]> turn = new HashMap<>();
        dir.put(0, new int[]{0,1});
        dir.put(1, new int[]{1,0});
        dir.put(2, new int[]{0,-1});
        dir.put(3, new int[]{-1,0});
        turn.put(0, new int[]{3,1});
        turn.put(1, new int[]{0,2});
        turn.put(2, new int[]{1,3});
        turn.put(3, new int[]{2,0});
        Set<String> set = new HashSet<>();
        for (int[] o : obstacles) {
        	set.add(o[0] + "+" + o[1]);
        }
        int face = 0;
        int[] start = new int[]{0,0};
        for (int command : commands) {
        	if (command == -2) {
        		face = turn.get(face)[0];
        	}
        	else if (command == -1) {
        		face = turn.get(face)[1];
        	}
        	else {
        		int len = command;
        		while (len > 0) {
        			int x = start[0] + dir.get(face)[0]; 
        			int y = start[1] + dir.get(face)[1];
        			if (!set.contains(x + "+" + y)) {
        				start[0] += dir.get(face)[0];
        				start[1] += dir.get(face)[1];
        				max = Math.max(max, start[0]*start[0] + start[1]*start[1]);
        			}
        			else {
        				break;
        			}
        			len--;
        		}
        	}
        }
        return max;
    }

}
