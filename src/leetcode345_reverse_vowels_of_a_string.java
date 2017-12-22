import java.util.HashSet;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月22日 下午9:32:18
* 类说明: 可以运用典型的two points方法解决
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
        // 元音字母集合
        String vowels = "aeiouAEIOU";
        Set<Character> set = new HashSet<>();
        for (char c: vowels.toCharArray()){
        	set.add(c);
        }
        char[] array = s.toCharArray();
        while (start < end){
        	//从开头开始 找到第一个元音字母
        	while (start < end && !set.contains(array[start])){
        		start++;
        	}
        	// 从尾部开始找到第一个元音字母
        	while (start < end && !set.contains(array[end])){
        		end--;
        	}
        	// 交换
        	Character temp = array[start];
        	array[start] = array[end];
        	array[end] = temp;
        	start++;
            end--;
        }
        return String.valueOf(array);
		
    }

}
