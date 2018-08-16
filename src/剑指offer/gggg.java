package 剑指offer;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月11日 上午10:18:20
* 类说明: 
*/
public class gggg {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
        	a[i] = scanner.nextInt();
        }
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
        	t[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
        	int temp = 0;
        	if (t[i] == 0) {
        		for (int g = 0; g < k; g++) {
        			if ((i + g) < n) {
        				temp += a[g + i];
        			}
        		}
        		map.put(i, temp);
        	}
        	max = Math.max(max, temp);
        }
        int index = -1;
        int res = 0;
    	for (int key : map.keySet()) {
    		if (map.get(key) == max) {
    			index = key;
    		}
    	}
    	if (index != -1) {
    		for (int i = 0; i < index; i++) {
    			if (t[i] == 1) {
    				res += a[i];
    			}
    		}
    		for (int i = index + k; i < n; i++) {
    			if (t[i] == 1) {
    				res += a[i];
    			}
    		}
    		System.out.println(res + max);
    	}
    	else {
    		for (int i = 0; i < n; i++) {
    			res += a[i];
    		}
    		System.out.println(res);
    	}
	}
	
}
