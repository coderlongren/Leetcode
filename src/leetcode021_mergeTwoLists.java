
public class leetcode021_mergeTwoLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkNode l1 = new LinkNode(1);
		LinkNode l2 = new LinkNode(2);
		l1.next = new LinkNode(3);
		l2.next = new LinkNode(4);
		l1.next.next = new LinkNode(5);
		
		LinkNode p = mergeTwoLists(l1, l2);
		while (p != null) {
			System.out.println(p.val);
			p = p.next;
		}
	}
	
	public static class LinkNode{
		int val;
		LinkNode next;
		public LinkNode(int val) {
			this.val = val;
		}
	} 
	
	public static LinkNode mergeTwoLists(LinkNode l1,LinkNode l2){
		if (l1 == null && l2 == null){
			return null;
		}
		if (l1 == null){
			return l2;
		}
		if (l2 == null){
			return l1;
		}
		// head node p 
		LinkNode p = new LinkNode(0);
		LinkNode head = p;
		// merge two list 
		while (l1 != null && l2 != null){
			if (l1.val < l2.val){
				p.next = l1;
				l1 = l1.next;
			}
			else {
				p.next = l2;
				l2 = l2.next;
			}
			p = p.next;
		}
		if (l1 == null){
			p.next= l2;
		}
		else {
			p.next = l1;
		}
		
		return head.next;
	}

}