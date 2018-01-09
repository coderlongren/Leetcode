package LRU容器;

import java.util.LinkedHashMap;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月9日 下午6:12:52
* 类说明:  通过集成LinkedHashMap实现 LRU容器
*/
public class LRU<K,V>  extends LinkedHashMap<K, V>{
	// maxEntries最大缓存个数
	private int maxEntries;
	
	public LRU(int max){
		// 16是默认的哈希桶长度，0.75 是loadFact 两者相乘是 哈希表扩长上限
		super(16,0.75f,true);
		this.maxEntries = max;
	}
	
}
