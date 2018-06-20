package BloomFilter;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��7�� ����9:40:41
* ��˵��: �򵥵Ĺ�ϣӳ�� 
*/

public class SimpleHash {
	private int cap;
	private int seed;
	public SimpleHash(int cap, int seed) {
		this.cap = cap;
		this.seed = seed;
	}
	// Hash function
	public int hash(String value) {
		int result = 0;
		int len = value.length();
		for (int i = 0; i < len; i++) {
			result = seed*result + value.charAt(i);
		}
		return (cap - 1) & result;
	}
}
