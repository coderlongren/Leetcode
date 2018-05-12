import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月10日 上午10:27:21
* 类说明: 
*/
public class leetcode023_Merge_K_Sorted_lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(5);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);	
		ListNode l3 = new ListNode(2);
		l3.next = new ListNode(6);
		List<ListNode> lists = new ArrayList<>();
		lists.add(l1);
		lists.add(l2);
		lists.add(l3);
		System.out.println(mergeKLists(lists));
	}
	public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }else if(lists.length == 1){
            return lists[0];
        }else{
            for(int steps = 1; steps < lists.length; steps = steps * 2){
                for(int i = 0; i < lists.length; i = i + 2*steps){
                    if(i + steps >= lists.length){
                        continue;
                    }else{
                        lists[i] = mergeTwoLists(lists[i], lists[i + steps]);
                    }
                }
            }
            return lists[0];
        }
    }
	public static ListNode mergeTwoLists(ListNode left, ListNode right) {
		
		return null;
		
	}
	// 最巧妙的 利用 PriorityQueue的Java代码
	public static ListNode mergeKLists(List<ListNode> lists) {
		
		PriorityQueue<ListNode> heap = new PriorityQueue<>(new Comparator<ListNode>() {

			@Override
			public int compare(ListNode o1, ListNode o2) {
				return o1.val - o2.val;
			}
		});
		if (lists == null || lists.size() == 0) {
			return null;
		}
		ListNode head = new ListNode(0);
		ListNode tail = head;
		for (ListNode listNode : lists) {
			if (listNode != null) {
				heap.offer(listNode);
			}
		}
		// 现在把所有的 链表都存进堆中了。 接下来就是调整堆
		while (!heap.isEmpty()) {
			tail.next = heap.poll();
			tail = tail.next;
			if (tail.next != null) {
				heap.offer(tail.next);
			}
		}
		return head.next;
	}
}
