import java.util.Arrays;


public class leetcode455_AssignCookies {

	//������� ���Ǳ����������� ���greed result++
	public static void main(String[] args) {
		
	}
    public static int findContentChildren(int[] g, int[] s) {
        
    	Arrays.sort(g);
    	Arrays.sort(s);
    	int result = 0;
    	int i = 0,j = 0;
    	String string ;
    	while (i < g.length && j < s.length){
    		//content
    		if (g[i] <= s[j]){
    			result++;
    			i++;
    			j++;
    		}
    		else{
    			j++;
    		}
    			
    			
    	}
    	return result;
    }	

}
