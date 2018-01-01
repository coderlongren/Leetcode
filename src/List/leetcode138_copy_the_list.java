package List;

import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月1日 下午1:35:22
* 类说明: 
*/
public class leetcode138_copy_the_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public RandomListNode copyRandomList(RandomListNode head) {
		  if (head == null) {
			  return null;
		  }
		  Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
		  
		  // loop 1. copy all the nodes
		  RandomListNode node = head;
		  while (node != null){
			  map.put(node, new RandomListNode(node.label));
			  node = node.next;
		  }
		  node = head;
		  
		  while (node != null){
			  map.get(node).next = map.get(node.next);
			  map.get(node).random = map.get(node.random);
			  node = node.next;
		  }
		  return map.get(head);
	}

}
