package List;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��30�� ����7:34:40
* ��˵��: �����תһ�����������Ծ����ʵ�������
*/
public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head = reverse(head);
		while (head != null){
			System.out.print(head.val + "->");
			head = head.next;
		}
	}
	public static ListNode reverse(ListNode head){
		
		ListNode pre = new ListNode(0);
		pre.next = head;
		ListNode start = head;
		ListNode then = start.next;
		for (int i = 1; i < 5; i++){
			start.next = then.next;
			then.next = pre.next;
			pre.next = then;
			then = start.next;
		}
		return pre.next;
		
	}

}
