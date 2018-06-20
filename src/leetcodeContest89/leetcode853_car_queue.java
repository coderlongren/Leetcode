package leetcodeContest89;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月17日 上午9:38:17
* 类说明: 
*/
public class leetcode853_car_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.remove(2);
//		System.out.println(list.size());
		int target = 21;
		int[] position = {1,15,6,8,18,14,16,2,19,17,3,20,5};
		int[] speed = {8,5,5,7,10,10,7,9,3,4,4,10,2};
		System.out.println(carFleet(target, position, speed));
		
		
	}
	public static int carFleet(int target, int[] position, int[] speed) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < position.length; i++) {
			map.put(position[i], speed[i]);
		}
		int size_left = position.length;
		boolean[] visit = new boolean[size_left];
		Arrays.sort(position);
		int count = 0;
		while (size_left > 0) {
			int top = Integer.MAX_VALUE;
			for (int i = position.length - 1; i >= 0; i--) {
				if (!visit[i]) {
					top = i;
					size_left--;
					break;
				}
			}
			visit[top] = true; //此top节点已访问过
			int top_speed = map.get(position[top]);
			for (int i = top - 1; i >= 0; i--) {
				if (!visit[i] && map.get(position[i]) > top_speed) {
					int upSpeed = map.get(position[i]) - top_speed;
					if ((target - position[top])*1.0/top_speed*upSpeed >= (float)(position[top] - position[i])) {
						visit[i] = true;
						size_left--;
					}
				}
			}
			count++;
		}
		
		return count;
    }

}
