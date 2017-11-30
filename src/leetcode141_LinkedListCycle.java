
public class leetcode141_LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	// 我们要记住 leetcode上面的链表都是没有头结点的  
	// 所以我们 可以设置 快慢指针 如果链表是环形的 那么快指针 一定可以追上慢指针
	public static boolean hasCycle(ListNode head) {
		ListNode walker = head;
		ListNode runner = head;
		while (runner.next != null && runner.next.next != null){
			walker = walker.next;
			runner = runner.next.next;
			if (runner == walker){
				return true;
			}
		}
		
        return false;
    }

}
