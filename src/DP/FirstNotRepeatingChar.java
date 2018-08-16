package DP;

import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月7日 下午9:37:06
* 类说明: 
*/
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char item : chars) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            }
            else {
                map.put(item, 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

}
