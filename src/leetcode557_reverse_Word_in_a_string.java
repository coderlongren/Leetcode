import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月6日 下午8:33:19
* 类说明: 
*/
public class leetcode557_reverse_Word_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
	public static String reverseWords(String s) {
        if (s == null || s.length() == 0){
        	return "";
        }
        String[] ss = s.split(" ");
        String res = "";
        for (int i = 0; i < ss.length; i++){
        	StringBuilder stringBuilder = new StringBuilder(ss[i]);
        	res  = res + stringBuilder.reverse().toString() + " ";
        }
        res = res.trim();
        return res;
    }

}
