package ��ָoffer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��6�� ����9:17:46
* ��˵��: 
*/
public class ����һ���Ԫ�� {
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
