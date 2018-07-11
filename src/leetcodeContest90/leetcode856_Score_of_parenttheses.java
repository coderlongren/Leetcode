package leetcodeContest90;

import java.util.ArrayList;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��25�� ����7:41:28
* ��˵��: 
*/
public class leetcode856_Score_of_parenttheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(scoreOfParentheses("(())"));
//		List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.set(0, 2);
//		System.out.println(list.get(0));
		
		System.out.println(score("(())()"));
	}
	public static int scoreOfParentheses(String S) {
		int res[] = new int[30], i = 0;
        for (char c : S.toCharArray())
            if (c == '(') {
            	i++;
            	res[i] = 0;
            } 
            else  {
            	res[i - 1] += Math.max(res[i] * 2, 1);
            	i--;
            }
        return res[0];
        
    }
	 // �Լ���д�Ķ�ջ���������� ������100%���ύ�ߡ�
	public static int score(String S) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		for (char c : S.toCharArray()) {
			if (c == '(') {
				list.add(0);
			} else {
				int max = Math.max(1, list.get(list.size() - 1)*2);
				list.set(list.size() - 2, list.get(list.size() - 2) + max);
				list.remove(list.size() - 1);
			}
		}
		return list.get(0);
	}
//	class inner{
//		int val = 0;
//		public inner(int val) {
//			// TODO Auto-generated constructor stub
//			this.val = val;
//		}
//		
//	}
}
