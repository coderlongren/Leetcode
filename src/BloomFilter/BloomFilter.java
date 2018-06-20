package BloomFilter;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��6�� ����6:44:38
* ��˵��:  ��¡����������Ҫʵ����
*     <dependencies>  
            <dependency>  
                <groupId>com.google.guava</groupId>  
                <artifactId>guava</artifactId>  
                <version>22.0</version>  
            </dependency>  
        </dependencies>  
         Google ����
*/

import java.util.BitSet;

public class BloomFilter{
// ��������λ��
	private static final int DEFAULT_SIZE = 1<<25; // ����ԭ��д���� 2^24�η���������25�η���
	
	// ��ͬ�Ĺ�ϣ��������Ҫ��ͬ�Ĺ�ϣ���ӣ�ȡ����
	private static final int[] seeds = new int[]{5, 7, 11, 13, 31, 37, 61};
	
	private BitSet bits = new BitSet(DEFAULT_SIZE);
	
	// ��ϣӳ�����
	private SimpleHash[] func = new SimpleHash[seeds.length];
	
	public BloomFilter() {
		for (int i = 0; i < seeds.length; i++) {
			func[i] = new SimpleHash(DEFAULT_SIZE, seeds[i]);
		}
	}
	 
	// ���ַ�����ǵ� bits��ȥ
	public void add(String value) {
		for (SimpleHash f : func) {
			bits.set(f.hash(value), true);
		}
	}
	//�ж��ַ����Ƿ��Ѿ���bits���
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
