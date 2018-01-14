package leetcodeContest67;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��14�� ����10:48:06
* ��˵��:  ���ǻ������ڷ��� ����Ӧ��
*/
public class leetcode763_Partition_labels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "ababcbacadefegdehijhklij";
		System.out.println(partitionLabels(S));
	}
	 public static List<Integer> partitionLabels(String S) {
	        List<Integer> res = new ArrayList<>();
	        
	        int[] table = new int[26];
	        char[] stc = S.toCharArray();
	        for(char c:stc)// ��¼C ������String������ֵĴ���
	            table[c-'a']++;
	        
	        int i = 0, j = 0, l = S.length(), counter = 0;
	        HashSet<Character> hs = new HashSet<>();
	        while(j < l){
	            char c = stc[j];
	            if(!hs.contains(c)){//  count��¼��   ���˴���������ַ������涼�������������������ַ���Ҳ����˵��������Ƕ����������ַ�����
	                hs.add(c);
	                counter++;
	            }
	            table[c-'a']--; // 
	            j++;
	            if(table[c-'a'] == 0){ // table[c - 'a'] == 0 Ҳ����ζ�Ŵ����Ѿ������ַ����������е�����ַ� c
	                counter--;
	                hs.remove(c);
	            }
	            if(counter == 0){// ���count��˵�����������Ƕ����������ַ����� 
	                res.add(j - i);// ��������ڵĳ��ȼ�¼��res
	                i = j;// ����ѡ��һ�����ڣ�Ҳ�����������   i����
	            }            
	        } 
	        return res;
	    }

}
