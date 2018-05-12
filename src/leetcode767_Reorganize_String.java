import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月11日 下午7:19:16
* 类说明: 
*/
public class leetcode767_Reorganize_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reorganizeString("aabbcc"));
	}
	
	// 其实就是 358 那道求 字符距离至少为K的题目。 k =2 
	public static String reorganizeString(String S) {
        if (S == null || S.length() == 0) {
            return "";
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));
        pq.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        Queue<Map.Entry<Character, Integer>> queue = new LinkedList<>();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            sb.append(entry.getKey());
            entry.setValue(entry.getValue() - 1);
            queue.offer(entry);
            while (queue.size() > 2) {
                Map.Entry<Character, Integer> temp = queue.poll();
                if (temp.getValue() > 0) {
                    pq.offer(temp);
                }
            }
        }
        return sb.length() == S.length() ? sb.toString() : "";
    }

}
