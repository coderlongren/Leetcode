import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��6�� ����3:10:22
* ��˵��: 
*/
public class leetcode338_Counting_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countBits(5));
		System.out.println();
		System.out.println(1>>1 + (1&1));
	}
	public static int[] countBits(int num) {
        if (num < 0) {
        	return null;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= num; i++) {
        	String bits = Integer.toBinaryString(i);
        	int temp = 0;
        	for (int j = 0; j < bits.length(); j++) {
        		if (bits.charAt(j) == '1') {
        			temp++;
        		}
        	}
        	res.add(temp);
        	
        }
        Integer[] result = res.toArray(new Integer[1]);
        int[] dd = new int[result.length];
        for (int i = 0; i < dd.length; i++) {
        	dd[i] = result[i];
        }
		return dd;
        
    }
	// ��һ���λ����
	// ��Ҫ��˼�뻹��  dp[i] = dp[i/2] + i%2 ��Ȼд��λ���㣬Ч������ߵģ�0,1,0,10,1
	// dp[0] = 0;
	// dp[1] = dp[0] + 1&1 = 1
	// dp[2] = dp[2/2] + 2&1 = 1 + 0 = 1;
	// dp[3] = dp[1] + 3&1 = 1 + 1 = 2;
	// .........
	public static int[] countBits2(int num) {
	    int[] f = new int[num + 1];
	    for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
	    return f;
	}

}
