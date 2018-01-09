package LRU����;

import java.util.LinkedHashMap;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��9�� ����6:12:52
* ��˵��:  ͨ������LinkedHashMapʵ�� LRU����
*/
public class LRU<K,V>  extends LinkedHashMap<K, V>{
	// maxEntries��󻺴����
	private int maxEntries;
	
	public LRU(int max){
		// 16��Ĭ�ϵĹ�ϣͰ���ȣ�0.75 ��loadFact ��������� ��ϣ����������
		super(16,0.75f,true);
		this.maxEntries = max;
	}
	
}
