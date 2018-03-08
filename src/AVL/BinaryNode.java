package AVL;

import java.io.Serializable;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��7�� ����6:39:04
* ��˵��: ��������� 
*/
public class BinaryNode<T extends Comparable> implements Serializable{
    private static final long serialVersionUID = -6477238039299912313L;

    public BinaryNode<T> left;//����

    public BinaryNode<T> right;//�ҽ��

    public T data;

    public BinaryNode(T data,BinaryNode left,BinaryNode right){
        this.data=data;
        this.left=left;
        this.right=right;
    }

    public BinaryNode(T data){
        this(data,null,null);

    }

    /**
     * �ж��Ƿ�ΪҶ�ӽ��
     * @return
     */
    public boolean isLeaf(){
        return this.left==null&&this.right==null;
    }

}