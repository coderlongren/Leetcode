import java.util.HashSet;
import java.util.Set;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��22�� ����9:32:18
* ��˵��: �������õ��͵�two points�������
*/
public class leetcode345_reverse_vowels_of_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "hello";
		System.out.println(reverseVowels(string));
	}
	public static String reverseVowels(String s) {
        if (s == null || s.length() == 0){
        	return s;
        }
        int start = 0;
        int end = s.length() - 1;
        // Ԫ����ĸ����
        String vowels = "aeiouAEIOU";
        Set<Character> set = new HashSet<>();
        for (char c: vowels.toCharArray()){
        	set.add(c);
        }
        char[] array = s.toCharArray();
        while (start < end){
        	//�ӿ�ͷ��ʼ �ҵ���һ��Ԫ����ĸ
        	while (start < end && !set.contains(array[start])){
        		start++;
        	}
        	// ��β����ʼ�ҵ���һ��Ԫ����ĸ
        	while (start < end && !set.contains(array[end])){
        		end--;
        	}
        	// ����
        	Character temp = array[start];
        	array[start] = array[end];
        	array[end] = temp;
        	start++;
            end--;
        }
        return String.valueOf(array);
		
    }

}
