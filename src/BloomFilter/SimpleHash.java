package BloomFilter;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月7日 上午9:40:41
* 类说明: 简单的哈希映射 
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
