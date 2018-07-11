package leetcodeContest91;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年7月1日 上午9:38:52
* 类说明: 
*/
public class leetcode860_Lemonade_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bills = {5,5,5,5,5,5,10,20,20};
		System.out.println(lemonadeChange(bills));
	}
	public static boolean lemonadeChange(int[] bills) {
        if (bills.length == 0) {
            return true;
        }
        int count = bills.length;
        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < count; i++) {
//        	map.put(bills[i], map.getOrDefault(bills[i], 0) + 1);
//        }
//        Arrays.sort(bills);
        for (int i = 0; i < count; i++) {
        	if (bills[i] == 5) {
        		map.put(bills[i], map.getOrDefault(bills[i], 0) + 1);
        		continue;
        	}
        	if (bills[i] == 10) {
        		if (!map.containsKey(5) || map.get(5) < 1) {
        			return false;
        		}
        		map.put(5, map.get(5) - 1);
        		map.put(bills[i], map.getOrDefault(bills[i], 0) + 1);
        	}
        	else {
        		if (map.containsKey(5) && !map.containsKey(10)) {
        			if (map.get(5) >= 3) {
                		map.put(5, map.get(5) - 3);
            		}
        			else {
        				return false;
        			}
        		}
        		else if (map.containsKey(5) && map.containsKey(10)) {
        			if (map.get(5) >= 1 && map.get(10) >= 1) {
                		map.put(5, map.get(5) - 1);
                		map.put(10, map.get(10) - 1);
            		}
        			else if (map.get(5) >= 3) {
        				map.put(5, map.get(5) - 3);
        			}
        			else {
        				return false;
        			}
        		}
        		else {
        			return false;
        		}
        	}
        }
        return true;
    }

}
