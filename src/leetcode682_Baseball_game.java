import java.util.LinkedList;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��17�� ����8:56:42
* ��˵��: 
*/
public class leetcode682_Baseball_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int calPoints(String[] ops) {
        int sum = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for (String op : ops) {
            if (op.equals("C")) {
                sum -= list.removeLast();
            }
            else if (op.equals("D")) {
                list.add(list.peekLast() * 2);
                sum += list.peekLast();
            }
            else if (op.equals("+")) {
                list.add(list.peekLast() + list.get(list.size() - 2));
                sum += list.peekLast();
            }
            else {
                list.add(Integer.parseInt(op));
                sum += list.peekLast();
            }
        }
        return sum;
    }

}
