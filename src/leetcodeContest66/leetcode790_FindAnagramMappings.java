package leetcodeContest66;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月7日 上午10:57:30
* 类说明: 
*/
public class leetcode790_FindAnagramMappings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {12, 28, 46, 32, 50};
		int[] B = {50, 12, 32, 46, 28};
		anagramMappings(A, B);
	}
	public static int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < B.length; i++){
        	map.put(B[i], i);
        }
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < A.length; i++){
//        	map.put(B[i], i);
        	list.add(map.get(A[i]));
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++){
        	res[i] = list.get(i);
        }
        return res;
    }

}
