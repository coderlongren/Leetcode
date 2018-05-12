import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月11日 下午7:47:02
* 类说明:  hard 难度的题目啊
*/
public class leetcode358_RearrangeStringkDistanceApart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rearrangeString("aab", 3));
	}
	// 使用堆结构， HashTable， queue 
	public static String rearrangeString(String string, int k) {
		if (k == 0) {
			return string;
		}
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
			if (!map.containsKey(string.charAt(i))) {
				map.put(string.charAt(i), 1);
			}
			else {
				map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
			}
		}
		// 使用 优先队列--》 Java自实现的堆结构才是最牛逼的
		PriorityQueue<Map.Entry<Character, Integer>> heap = new PriorityQueue<>(new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue() - o1.getValue();
			}
		});
		StringBuilder sb = new StringBuilder();
		heap.addAll(map.entrySet());
		Queue<Map.Entry<Character, Integer>> queue = new LinkedList<>();
		// 堆不为空是 继续
		while (!heap.isEmpty()) {
			// 弹出的是出现次数最多的字符 aa cc vvv 
			Map.Entry<Character, Integer> temp = heap.poll(); // 堆顶节点 弹出， 
			
			sb.append(temp.getKey()); //
			
			temp.setValue(temp.getValue() - 1); // 用过一次这个字符， entry里面的个数减一是肯定的
			queue.offer(temp); // 为什么要把这个entry入队呢？ 认真思考一下， 这是这个算法最妙的地方 
							   // 我们不是要保证相同的字符要间隔K距离吗？ 不相邻， 即间隔至少为 1
			while (queue.size() > (k - 1)) { // 保证queue里 至少有 k - 1个entry
				Map.Entry<Character, Integer> poll = queue.poll();
				if (poll.getValue() > 0) {
					heap.offer(poll);
				}
			}
		}
		if (sb.length() == string.length()) {
			return sb.toString();
		}
		return "";
		
		
	}
}
