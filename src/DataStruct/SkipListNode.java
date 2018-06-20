package DataStruct;

import org.hamcrest.core.IsInstanceOf;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月16日 晚上 12:57:15
* 类说明:  跳跃表的节点类， 包含了key-value left, right,up,down 四个指针
*  借鉴了 https://blog.csdn.net/BrilliantEagle/article/details/52206261 的code
*/
public class SkipListNode<T> {
	public int key;
	public T value;
	public SkipListNode<T> up, down, left, right; // 上下左右四个指针
	public static final int HEAD_KEY = Integer.MIN_VALUE;
	public static final int TAIL_KEY = Integer.MAX_VALUE;
	// 构造函数
	public SkipListNode(int k, T V) {
		this.key = k;
		this.value = V;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	// 重写了 equals() 用于比较
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof SkipListNode<?>)) {
			return false;
		}
		SkipListNode<T> other = (SkipListNode<T>)obj; // 强转类型
		try{
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.toString());
		}
		return other.key == key && other.value == value;
		
	}
	@Override
	public String toString() {
		return "Key-Value: " + key + "-" + value;
	}

}
