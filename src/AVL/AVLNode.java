package AVL;
/**
 * 
 * @author Administrator
 * 平衡二叉树 节点 
 * @param <T>
 */
public class AVLNode<T extends Comparable> {
	//左节点 
	public AVLNode<T> left;
	//右节点
	public AVLNode<T> right;
	
	public T date;
	//当前节点的 高度
	public int height;
	
	public AVLNode(T date){
		this(null,null,date);
	}

	public AVLNode(AVLNode<T> left, AVLNode<T> right, T date) {
		this(left,right,date,0);
	}

	public AVLNode(AVLNode<T> left, AVLNode<T> right, T date,int height) {
		this.left = left;
		this.right = right;
		this.date = date;
		this.height = height;
		
	}
}
