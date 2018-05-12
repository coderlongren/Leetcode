package leetcodeContest83;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月6日 上午10:00:28
* 类说明: 
*/
public class leetcode931_masking_personal_information {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public String maskPII(String S) {
	        if (isEmail(S))
	            return maskEmail(S);
	        else
	            return maskPhone(S);
	    }
	    
	    private boolean isEmail(String s) {
	        for (char c : s.toCharArray()) {
	            if (c == '@') {
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    private String maskEmail(String S) {
	        StringBuilder stringBuilder = new StringBuilder();
	        stringBuilder.append(S.toLowerCase().charAt(0));
	        for (int i = 0; i < 5; i++) {
	            stringBuilder.append('*');
	        }
	        boolean beforeAt = true;
	        for (int i = 0; i < S.length(); i++) {
	            if (beforeAt) {
	                if (S.charAt(i + 1) == '@') {
	                    stringBuilder.append(S.toLowerCase().charAt(i));
	                    beforeAt = false;
	                }
	            } else {
	                stringBuilder.append(S.toLowerCase().charAt(i));
	            }
	        }
	        return stringBuilder.toString();
	    }

	    private String maskPhone(String S) {
	        String pureNumbers = getNumbers(S);
	        StringBuilder res = new StringBuilder();
	        int i = 0;
	        if (pureNumbers.length() > 10) {
	            res.append('+');
	            for (; i < pureNumbers.length() - 10; i++) {
	                res.append('*');
	            }
	            res.append('-');
	        }

	        int count = 0;
	        for (; i < pureNumbers.length(); i++) {
	            if (count < 2) {
	                for (int j = 0; j < 3; j++) {
	                    res.append('*');
	                    ++i;
	                }
	                res.append('-');
	                --i;
	                ++count;
	            } else {
	                res.append(pureNumbers.charAt(i));
	            }
	        }
	        return  res.toString();
	    }

	    private String getNumbers(String S) {
	        StringBuilder stringBuilder = new StringBuilder();
	        for (int i = 0; i < S.length(); i++) {
	            char c = S.charAt(i);
	            if (c >= 48 && c <= 57)
	                stringBuilder.append(c);
	        }
	        return stringBuilder.toString();
	    }
}
