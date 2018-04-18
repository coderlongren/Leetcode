import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��15�� ����10:09:40
* ��˵��: 
*/
public class leetcode241_DifferentWaysAddParentheses {
	// �����洢���Ѿ�����������Ӵ�
	private Map<String, List<Integer>> map = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leetcode241_DifferentWaysAddParentheses test = new leetcode241_DifferentWaysAddParentheses();
		System.out.println(test.diffWaysToCompute2("1+2"));
	}
	// �ǵ���������������dp���ţ�������������ظ������Ǻܺ��õ�
	public  List<Integer> diffWaysToCompute2(String input) {
		// ������Map�Ȱѣ���Щ�Ѿ�����ĳ���input,�浽Map�У�
		// �Ժ������������ͬ��ֱ���ó�������
		if (map.containsKey(input)) {
			return map.get(input);
		}
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '+' || ch == '-' || ch == '*') {
				for (Integer l : diffWaysToCompute2(input.substring(0, i))) {
					for (Integer r : diffWaysToCompute2(input.substring(i + 1,input.length()))) {
						if (ch == '+') {
							res.add(l + r);
						}
						else if (ch == '-') {
							res.add(l - r);
						}
						else {
							res.add(l*r);
						}
					}
				}
			}
		}
		if (res.size() == 0) {
			res.add(Integer.valueOf(input));
		}
		map.put(input, res);
		return res;
	}

}
