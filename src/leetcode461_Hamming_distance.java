/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��19�� ����10:32:06
* ��˵��:  easy
*/
public class leetcode461_Hamming_distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.bitCount(8^1));
		System.out.println(8^1);
	}
	 public int hammingDistance(int x, int y) {
		 
		return Integer.bitCount(x^y);
		
	 }
}
