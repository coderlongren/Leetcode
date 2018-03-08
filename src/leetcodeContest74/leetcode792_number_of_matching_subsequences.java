package leetcodeContest74;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月4日 下午12:40:17
* 类说明: 
*/
public class leetcode792_number_of_matching_subsequences {
	public int numMatchingSubseq(String S, String[] words) {
        int count = 0;
        for(String word:words){
            if(isSubsequence(S,word))
                count++;
        }       
        return count;
    }
    // 总感觉整个判断 isSubsequences有点问题， 如果中间出现了重复的话,,,,,,,
	// 不过确实代码 确实 AC了
    public boolean isSubsequence(String str,String t){
        int i = 0, j = 0, l1 = str.length(), l2 = t.length();
        if(l2 > l1){
            return false;
        }
        while(i < l1 && j < l2){
            if(str.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j == l2;
    }
}
