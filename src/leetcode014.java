
public class leetcode014 {
/**
 * 
 *  a function to find the longest common prefix string amongst an array of strings. aram args
 */
	
	public static void main(String[] args) {
		String[] strs = {"aab","av","aaaagfg","aaffgdfg","aaf"};
		System.out.println(longestCommonPrefix(strs));

	}
    public static String longestCommonPrefix(String[] strs) {
    	
    	if(strs == null || strs.length == 0){
    		return "";
    	}
    	String prefix = strs[0];
    	
    	for (int i = 1; i < strs.length; i++){
    		if (prefix.length() == 0 || strs[i].length() == 0){
    			return "";
    		}
    		int len;
    		if (prefix.length() < strs[i].length()){
    			len = prefix.length();
    		}
    		else {
				len = strs[i].length();
			}
    		int j;
    		for (j = 0; j < len; j++){
    			if (prefix.charAt(j) != strs[i].charAt(j)){
    				break;
    			}
    		}
    		prefix = prefix.substring(0, j);
    	}
    	
        return prefix;
    }

}
