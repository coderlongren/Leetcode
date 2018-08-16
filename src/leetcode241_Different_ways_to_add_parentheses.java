import java.awt.image.RescaleOp;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��15�� ����8:41:44
* ��˵��: �����㷨�Ļ���˼���ǽ�һ����ģΪN������
* �ֽ�ΪK����ģ��С�������⣬
* ��Щ�������໥��������ԭ����������ͬ�����������Ľ�,
* �Ϳɵõ�ԭ����Ľ⡣
*/
public class leetcode241_Different_ways_to_add_parentheses {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "1+1+2";
		System.out.println(diffWaysToCompute(input));
	}
	// ����㷨��û�п����ظ������ء����·��������˺ܶ���������
	public static List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
        	if (input.charAt(i) == '-' 
        			|| input.charAt(i) == '+' 
        			|| input.charAt(i) == '*') {
        		String part1 = input.substring(0, i);
        		String part2 = input.substring(i + 1);
        		List<Integer> part1Ret = diffWaysToCompute(part1);
        		List<Integer> part2Ret = diffWaysToCompute(part2);
        		
        		for (Integer p1 : part1Ret) {
        			for (Integer p2 : part2Ret) {
        				int c = 0;
        				switch (input.charAt(i)) {
                        case '+': 
                        	c = p1+p2;
                        	res.add(c);
                            break;
                        case '-': 
                        	c = p1-p2;
                        	res.add(c);
                            break;
                        case '*': 
                        	c = p1*p2;
                        	res.add(c);
                            break;
        				}
        				
        			}
        		}
        	}
        }
        
        // ������û���������ţ�ֻ��һ�����ֵĻ�
        if (res.size() == 0) {
        	res.add(Integer.valueOf(input));
        }
		return res;
    }

}