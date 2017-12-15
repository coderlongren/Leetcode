import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��15�� ����7:34:46
* ��˵��: 
*/
public class leetcode438_Find_anagrems_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababababab";
		String p = "aab";
		System.out.println(findAnagrams(s, p));
	}
	 public static List<Integer> findAnagrams(String s, String p) {
//		 StringBuilder stringBuilder = new StringBuilder();
		 String result = "";
		 List<Integer> list = new LinkedList<>();
		 Set<Character> set = new HashSet<>();
		 for (int i = 0; i < p.length(); i++) {
			set.add(p.charAt(i));
		}
//		 for (Character character : set) {
//			System.out.println(character);
//		}
		 int length = p.length();
		 
		 for (int i = 0; i < s.length() - length + 1;i++){
			 Set<Character> temp = new HashSet<>();
			 boolean flag = true;
			 for (int j = i; j < i + length;j++){
				 temp.add(s.charAt(j));
			 }
			 for (Character character : set) {
				if (!temp.contains(character)){
					flag = false;
					break;
				}
			}
			 for (Character character : temp){
				 if (!set.contains(character)){
					 flag = false;
						break;
				 }
			 }
			 if (flag){
				 list.add(i);
			 }
		 }
		 
		return list;
		 
	 }
}
