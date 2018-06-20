package BloomFilter;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月6日 下午6:44:38
* 类说明:  布隆过滤器的主要实现类
*     <dependencies>  
            <dependency>  
                <groupId>com.google.guava</groupId>  
                <artifactId>guava</artifactId>  
                <version>22.0</version>  
            </dependency>  
        </dependencies>  
         Google 依赖
*/

import java.util.BitSet;

public class BloomFilter{
// 过滤器的位数
	private static final int DEFAULT_SIZE = 1<<25; // 作者原来写的是 2^24次方，明显是25次方啊
	
	// 不同的哈希函数，需要不同的哈希种子，取质数
	private static final int[] seeds = new int[]{5, 7, 11, 13, 31, 37, 61};
	
	private BitSet bits = new BitSet(DEFAULT_SIZE);
	
	// 哈希映射对象
	private SimpleHash[] func = new SimpleHash[seeds.length];
	
	public BloomFilter() {
		for (int i = 0; i < seeds.length; i++) {
			func[i] = new SimpleHash(DEFAULT_SIZE, seeds[i]);
		}
	}
	 
	// 把字符串标记到 bits中去
	public void add(String value) {
		for (SimpleHash f : func) {
			bits.set(f.hash(value), true);
		}
	}
	//判断字符串是否已经被bits标记
	public boolean contains(String value) {
		if (value ==null) {
			return false;
		}
		
		boolean ret =true;
		
		for (SimpleHash f : func) {
			ret = ret && bits.get(f.hash(value));
		}
		return ret;
	}
}
