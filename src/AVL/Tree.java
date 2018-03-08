package AVL;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��7�� ����6:38:20
* ��˵��: 
*/
/**
 * Created by zejian on 2016/12/14.
 * Blog : http://blog.csdn.net/javazejian [ԭ�ĵ�ַ,������ԭ��]
 */
public interface Tree<T extends Comparable> {

    /**
     * �п�
     * @return
     */
    boolean isEmpty();

    /**
     * �������Ľ�����
     * @return
     */
    int size();

    /**
     * ���ض������ĸ߶Ȼ������,�����������
     * @return
     */
    int height();

    /**
     * �ȸ��������
     */
    String preOrder();

    /**
     * �и��������
     */
    String inOrder();

    /**
     * ����������
     */
    String postOrder();

    /**
     * ��α���
     */
    String levelOrder();

    /**
     * ��data ����
     * @return
     */
    void insert(T data);


    /**
     * ɾ��
     */
    void remove(T data);

    /**
     * �������ֵ
     * @return
     */
    T findMin();

    /**
     * ������Сֵ
     * @return
     */
    T findMax();

    /**
     * ����ֵ�ҵ����
     * @param data
     * @return
     */
    BinaryNode findNode(T data);

    /**
     * �Ƿ����ĳ��ֵ
     * @param data
     * @return
     */
    boolean contains(T data) throws Exception;


    /**
     * ���
     */
    void clear();
}