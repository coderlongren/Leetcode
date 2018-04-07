import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月31日 下午4:29:45
* 类说明: 
*/
public class leetcode139_Word_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	// leetcode
	// ["leet", "code"]
	public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for (int i = 1; i <= s.length(); i++) {
        	for (String string : wordDict) {
        		if (string.length() <= i) {
        			if (dp[i - string.length()] == 1) {
        				
        			}
        		}
        	}
        }
		return false;
    }
	public boolean wordBreak2(String s, List<String> wordDict) {
		int[] dp = new int[s.length() + 1];
		dp[0] = 1;
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (dp[j] == 1 && wordDict.contains(s.substring(j, i))) {
					dp[i] = 1;
				}
			}
		}
		return dp[s.length()] == 1;
	}
}
