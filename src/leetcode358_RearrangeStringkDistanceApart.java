import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��5��11�� ����7:47:02
* ��˵��:  hard �Ѷȵ���Ŀ��
*/
public class leetcode358_RearrangeStringkDistanceApart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rearrangeString("aab", 3));
	}
	// ʹ�öѽṹ�� HashTable�� queue 
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
		// ʹ�� ���ȶ���--�� Java��ʵ�ֵĶѽṹ������ţ�Ƶ�
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
		// �Ѳ�Ϊ���� ����
		while (!heap.isEmpty()) {
			// �������ǳ��ִ��������ַ� aa cc vvv 
			Map.Entry<Character, Integer> temp = heap.poll(); // �Ѷ��ڵ� ������ 
			
			sb.append(temp.getKey()); //
			
			temp.setValue(temp.getValue() - 1); // �ù�һ������ַ��� entry����ĸ�����һ�ǿ϶���
			queue.offer(temp); // ΪʲôҪ�����entry����أ� ����˼��һ�£� ��������㷨����ĵط� 
							   // ���ǲ���Ҫ��֤��ͬ���ַ�Ҫ���K������ �����ڣ� ���������Ϊ 1
			while (queue.size() > (k - 1)) { // ��֤queue�� ������ k - 1��entry
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
