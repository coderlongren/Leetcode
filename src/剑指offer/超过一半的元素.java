package 剑指offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月6日 下午9:17:46
* 类说明: 
*/
public class 超过一半的元素 {
	public static void main(String[] args) {
		Arrays.sort(args);
	}
	public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int item : array) {
            if (map.containsKey(item)) {
            	map.put(item, map.get(item) + 1);
            }
            else {
            	map.put(item, 1);
            }
        }
        int len = array.length/2;
        for (Integer key : map.keySet()) {
        	if (map.get(key) > len) {
        		return key;
        	}
        }
        return 0;
    }
}
