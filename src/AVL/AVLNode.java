package AVL;
/**
 * 
 * @author Administrator
 * ƽ������� �ڵ� 
 * @param <T>
 */
public class AVLNode<T extends Comparable> {
	//��ڵ� 
	public AVLNode<T> left;
	//�ҽڵ�
	public AVLNode<T> right;
	
	public T date;
	//��ǰ�ڵ�� �߶�
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
