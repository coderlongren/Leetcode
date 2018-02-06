package leetcodeContest70;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��2��6�� ����5:35:21
* ��˵��:  ��ʱ
*/
public class leetcode779_Kth_Symbol_in_Grammar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(kthGrammar(4, 1));
	}
	public static int kthGrammar(int N, int K) {
        String row = "0";
        for (int i = 1; i < N; i++) {
        	StringBuilder stringBuilder = new StringBuilder();
        	for (Character character : row.toCharArray()) {
        		if (character == '0') {
        			stringBuilder.append("01");
        		}
        		else {
        			stringBuilder.append("10");
        		}
        	}
        	row = stringBuilder.toString();
        }
        Character res = row.toCharArray()[K - 1];
        if (res == '0') {
        	return 0;
        }
        else {
        	return 1;
        }
    }

}
