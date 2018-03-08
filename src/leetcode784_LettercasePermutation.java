import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;


/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��4�� ����2:01:49
* ��˵��: BFS/DFS  �������
*/
public class leetcode784_LettercasePermutation {
	
	// BFS solution
	public static List<String> letterCasePermutation(String S) {
//		Set<String> set = new HashSet<>();
		LinkedList<String> list = new LinkedList<>();
		char[] chars = S.toCharArray();
		list.add(S);
		for (int i = 0; i < S.length(); i++) {
			if (Character.isDigit(S.charAt(i))) {
				continue;
			}
			int size = list.size();
			for (int j = 0; j < size; j++) {
				String cur = list.get(j);
				char[] temp = cur.toCharArray();
				temp[i] = Character.toLowerCase(temp[i]);
				list.addLast(String.valueOf(temp));
				temp[i] = Character.toUpperCase(temp[i]);
				list.addLast(String.valueOf(temp));
			}
		}
		Set<String> set = new HashSet<>(list);
		return new LinkedList<>(set);
	}
	
	// DFS solution
	  public static List<String> letterCasePermutation2(String S) {
		  if (S == null) {
			  return new LinkedList<>();
		  }
		  List<String> res = new LinkedList<>();
		  helper(S,res,0);
		  return res;
	  }
	
	private static void helper(String s, List<String> res, int pos) {
		if (pos == s.length()) {
			res.add(s);
			return;
		}
		// ������
		if (s.charAt(pos) >= '0' && s.charAt(pos) <= '9') {
			helper(s, res, pos + 1);
			return;
		}
		char[] chs = s.toCharArray();
        chs[pos] = Character.toLowerCase(chs[pos]);
        helper(String.valueOf(chs), res, pos + 1);
        
        chs[pos] = Character.toUpperCase(chs[pos]);
        helper(String.valueOf(chs), res, pos + 1);
	}

	public static void main(String[] args) {
		String string = "a1b2";
		System.out.println(letterCasePermutation2(string));
		
	}
}
