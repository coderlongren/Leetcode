package 剑指offer;

import java.util.HashMap;
import java.util.Map;


/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月6日 下午5:19:54
* 类说明: 
*/
public class DeepCopy {
	public  RandomListNode Clone(RandomListNode pHead){
		if (pHead == null) {
			return null;
		}
		
		RandomListNode newHead = new RandomListNode(pHead.label);
		RandomListNode pre = pHead;
		RandomListNode newPre = newHead;
		Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
		map.put(pre, newPre); // 头结点全都进入
		
		// 处理所有next节点
		while (pre.next != null) {
			newPre.next = new RandomListNode(pre.next.label);
			pre = pre.next;
			newPre = newPre.next;
			map.put(pre, newPre);
		}
		
		// 处理所有random节点
		pre = pHead;
		newPre = newHead;
		
		while (pre != null) {
			newPre.random  = map.get(pre.random);
			newPre = newPre.next;
			pre = pre.next;
			
		}
		
		
		return newHead;
	}
}
