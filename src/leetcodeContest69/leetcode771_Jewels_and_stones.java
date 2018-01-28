package leetcodeContest69;

import java.util.HashSet;
import java.util.Set;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月28日 上午11:02:19
* 类说明: 
*/
public class leetcode771_Jewels_and_stones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        for (Character character : J.toCharArray()) {
			set.add(character);
		}
        int count = 0;
        for (Character character : S.toCharArray()) {
        	if (set.contains(character)){
        		count++;
        	}
		}
        return count;
        
    }

}
