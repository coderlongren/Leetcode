package List;

import java.util.HashMap;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月1日 上午11:05:47
* 类说明:  竟然不对，我自己测试的是通过的
*/
public class leetcode138_copy_list_with_random_pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public RandomListNode copyRandomList(RandomListNode head) {
		 if (head == null){
			 return null;
		 }
		 // 既然是深度拷贝，就不能再用原来的引用了 
		 RandomListNode newHead = new RandomListNode(head.label);
		 RandomListNode oldHead = head.next;
		 RandomListNode newList = newHead;
		 Map<RandomListNode,RandomListNode> map = new HashMap<>();
		 map.put(newHead,head);
		 // 深度拷贝
		 while (oldHead != null){
			 RandomListNode tem = new RandomListNode(oldHead.label);
			 newList.next = tem;
			 map.put(tem, oldHead);
			 oldHead = oldHead.next;
			 newList = newList.next;
		 }
		 
		 
		 // 随机指针 赋值
		 newList = newHead; // 重新指向 新的链表头节点
		 oldHead = head;
		 while (newList != null) {
			 newList.random = map.get(newList).random;
			 newList = newList.next;
			 oldHead = oldHead.next;
		}
		return newHead;
	        
	 }

}
