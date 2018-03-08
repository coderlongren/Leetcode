package leetcodeContest74;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��4�� ����12:40:17
* ��˵��: 
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
    // �ܸо������ж� isSubsequences�е����⣬ ����м�������ظ��Ļ�,,,,,,,
	// ����ȷʵ���� ȷʵ AC��
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
