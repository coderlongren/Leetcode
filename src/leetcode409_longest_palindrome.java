import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��14�� ����6:32:10
* ��˵��: Longest Palindrome 
*/
public class leetcode409_longest_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// �������һ����ѧʽ���˰� 
	public static int longest(String s){
		if (s == null || s.length() == 0){
			return 0;
		}
		int count = 0;
		Set<Character> set = new HashSet<>();
		for (Character character : s.toCharArray()) {
			if (set.contains(character)){
				set.remove(character);
				count++;
			}
			else {
				set.add(character);
			}
		}
		// �������� �䵥��Ԫ��
		if (!set.isEmpty()){
			return 2*count + 1;
		}
		else {
			return 2*count;
		}
	}

}
