
public class leetcode141_LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	// ����Ҫ��ס leetcode�����������û��ͷ����  
	// �������� �������� ����ָ�� ��������ǻ��ε� ��ô��ָ�� һ������׷����ָ��
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
