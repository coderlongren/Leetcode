import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月22日 下午10:05:22
* 类说明: 
*/
public class leetcode332_Reconstructs_itinerary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		System.out.println(list.get(0));
//		list.remove(0);
//		System.out.println(list.get(0));
		
		String[][] tickets = {{"MUC","LHR"},{"JFK","MUC"},{"SFO","SJC"},{"LHR","SFO"}};
		System.out.println(findItinerary2(tickets));
		
		
	}
	public static List<String> findItinerary(String[][] tickets) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        if (tickets == null || tickets.length == 0) {
        	return res;
        }
        for (String[] pair : tickets) {
        	if (map.containsKey(pair[0])) {
        		List<String> templitst = map.get(pair[0]);
        		templitst.add(pair[1]);
        		map.put(pair[0], templitst);
        	}
        	else {
        		List<String> templist = new ArrayList<>();
        		templist.add(pair[1]);
        		map.put(pair[0], templist);
        	}
        }
        Stack<String> stack = new Stack<>();
        stack.push("JFK");
        while (!stack.isEmpty()) {
        	String next = stack.peek();
        	if (map.containsKey(next) && !map.get(next).isEmpty()) {
        		stack.push(map.get(next).get(0));
        		map.get(next).remove(0);
        	}
        	else {
        		res.add(next);
        		stack.pop();
        	}
        }
        Collections.reverse(res);
		return res;
    }
	public static List<String> findItinerary2(String[][] tickets) {
        Map<String, PriorityQueue<String>> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        if (tickets == null || tickets.length == 0) {
        	return res;
        }
        for (String[] pair : tickets) {
        	if (map.containsKey(pair[0])) {
        		PriorityQueue<String> tempqueue = map.get(pair[0]);
        		tempqueue.offer(pair[1]);
        		map.put(pair[0], tempqueue);
        	}
        	else {
        		PriorityQueue<String> tempqueue = new PriorityQueue<>();
        		tempqueue.offer(pair[1]);
        		map.put(pair[0], tempqueue);
        	}
        }
        Stack<String> stack = new Stack<>();
        stack.push("JFK");
        while (!stack.isEmpty()) {
        	String next = stack.peek();
        	if (map.containsKey(next) && !map.get(next).isEmpty()) {
        		stack.push(map.get(next).peek());
        		map.get(next).poll();
        	}
        	else {
        		res.add(next);
        		stack.pop();
        	}
        }
        Collections.reverse(res);
		return res;
    }
}
