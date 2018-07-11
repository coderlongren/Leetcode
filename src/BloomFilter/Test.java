package BloomFilter;

import java.util.BitSet;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月6日 下午6:45:38
* 类说明:  测试我们的布隆过滤器的使用效率
*/
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BitSet bitSet = new BitSet(10);
		System.out.println(1<<25);
		int[] b = new int[2];
		bitSet.set(0, true);
		System.out.println(bitSet.get(1));
	}

}
