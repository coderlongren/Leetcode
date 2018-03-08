//package AVL;
///**
//* @author ���� : coderlong
//* @version ����ʱ�䣺2018��3��7�� ����6:41:21
//* ��˵��: 
//*/
///**
// * Created by zejian on 2016/12/14.
// * Blog : http://blog.csdn.net/javazejian [ԭ�ĵ�ַ,������ԭ��]
// * ���������
// */
//public class BinarySearchTree<T extends Comparable>  implements Tree<T> {
//
//    protected BinaryNode<T> root;
//
//    public BinarySearchTree(){
//        root =null;
//    }
//
//    /**
//     * �����ȸ����и������㷨���������
//     * @param pList �ȸ�/���������������
//     * @param inList �и�������������
//     * @param isPreOrder �Ƿ�Ϊ�ȸ�������������,true:�ȸ�,false:���
//     * Blog : http://blog.csdn.net/javazejian [ԭ�ĵ�ַ,������ԭ��]
//     */
//    public BinarySearchTree(T[] pList,T[] inList  ,boolean isPreOrder ){
//        if(pList==null||inList==null){
//            throw new RuntimeException("preList or inList can\'t be null");
//        }
//        if(isPreOrder) {
//            //�ȸ�/�и����򹹽�������
//            this.root = createBinarySearchTreeByPreIn(pList, inList, 0, pList.length - 1, 0, inList.length - 1);
//        }else {
//            //���/�и����򹹽�������
//            this.root = createBinarySearchTreeByPostIn(pList, inList, 0, pList.length - 1, 0, inList.length - 1);
//        }
//    }
//
//    /**
//     * �����ȸ����и������㷨���������
//     * @param preList �ȸ�������������
//     * @param inList �и�������������
//     * @param preStart
//     * @param preEnd
//     * @param inStart
//     * @param inEnd
//     * return root ���շ��صĸ����
//     */
//    public  BinaryNode<T>  createBinarySearchTreeByPreIn(T[] preList , T[] inList,int preStart ,int preEnd ,int inStart ,int inEnd){
//        //preList[preStart]������������,���������root
//        BinaryNode<T> p=new BinaryNode<>(preList[preStart]);
//        //���û������Ԫ��,��˵������ѹ������
//        if (preStart == preEnd && inStart == inEnd) {
//            return p;
//        }
//        //�ҳ��и�����ĸ�����±�root
//        int root=0;
//
//        for (root = inStart; root < inEnd; root++) {
//                //����и������е�Ԫ��ֵ���ȸ�����ĸ�����൱,����±�index��ΪinList�еĸ�����±�
//                if (preList[preStart].compareTo(inList[root])==0){
//                    break;
//                }
//        }
//
//        //��ȡ�������ĳ���
//        int leftLength=root-inStart;
//        //��ȡ�������ĳ���
//        int rightLength=inEnd-root;
//
//        //�ݹ鹹��������
//        if(leftLength>0){
//            //���������ȸ����У�preList[1] , ... , preList[i]
//            //���������и����У�inList[0] , ... , inList[i-1]
//            p.left=createBinarySearchTreeByPreIn(preList,inList,preStart+1,preStart+leftLength,inStart,root-1);
//        }
//
//        //����������
//        if (rightLength>0){
//            //���������ȸ����У�preList[i+1] , ... , preList[n-1]
//            //���������и����У�inList[i+1] , ... , inList[n-1]
//            p.right=createBinarySearchTreeByPreIn(preList,inList,preStart+leftLength+1,preEnd,root+1,inEnd);
//        }
//
//        return p;
//    }
//
//
//    /**
//     * ���/�и���������������
//     * @param postList �����������
//     * @param inList �и���������
//     * @param postStart
//     * @param postEnd
//     * @param inStart
//     * @param inEnd
//     * @return �����
//     */
//    public BinaryNode<T> createBinarySearchTreeByPostIn(T[] postList,T[] inList,int postStart,int postEnd,int inStart,int inEnd){
//
//        //���������
//        BinaryNode<T> p=new BinaryNode<>(postList[postEnd]);
//
//        if(postStart==postEnd && inStart==inEnd){
//            return p;
//        }
//
//        //�����и����еĸ�����±�root
//        int root=0;
//
//        for (root=inStart;root<inEnd;root++){
//            //���ҵ�
//            if (postList[postEnd].compareTo(inList[root])==0){
//                break;
//            }
//        }
//
//        //�������ĳ���
//        int leftLenght=root-inStart;
//        //�������ĳ���
//        int rightLenght=inEnd-root;
//
//        //�ݹ鹹��������
//        if(leftLenght>0){
//            //postStart+leftLenght-1:����������Ľ����±�
//            p.left=createBinarySearchTreeByPostIn(postList,inList,postStart,postStart+leftLenght-1,inStart,root-1);
//        }
//
//        //�ݹ鹹��������
//        if(rightLenght>0){
//            p.right=createBinarySearchTreeByPostIn(postList,inList,postStart+leftLenght,postEnd-1,root+1,inEnd);
//        }
//
//        return p;
//    }
//
//
//
//    @Override
//    public boolean isEmpty() {
//        return root==null;
//    }
//
//    /**
//     * �����С
//     * @return
//     */
//    @Override
//    public int size() {
//        return size(root);
//    }
//
//    /**
//     * �ݹ�ʵ�֣�������ڵ�root������subtreeʵ�ֵݹ�
//     * @param subtree
//     * @return
//     */
//    private int size(BinaryNode<T> subtree){
//        if (subtree == null)
//            return 0;
//        else
//        {
//            //�ԱȺ�ŵ��:H(n)=H(n-1) + 1 + H(n-1)
//            return size(subtree.left) + 1 + size(subtree.right);
//        }
//    }
//
//    /**
//     * �������
//     * @return
//     */
//    @Override
//    public int height() {
//        return height(root);
//    }
//
//    /**
//     * �ݹ�ʵ��
//     * @param subtree
//     * @return
//     */
//    private int height(BinaryNode<T> subtree){
//        if (subtree==null){
//            return 0;
//        }else {
//            int l=height(subtree.left);
//            int r=height(subtree.right);
//            return (l>r) ? (l+1):(r+1);//���ز����ϵ�ǰ��
//        }
//    }
//
//    @Override
//    public String preOrder() {
//        String sb=preOrder(root);
//        if(sb.length()>0){
//            //ȥ��β��","��
//            sb=sb.substring(0,sb.length()-1);
//        }
//        return sb;
//    }
//
//    /**
//     * �ȸ�����
//     * Blog : http://blog.csdn.net/javazejian [ԭ�ĵ�ַ,������ԭ��]
//     * @param subtree
//     * @return
//     */
//    private String preOrder(BinaryNode<T> subtree){
//        StringBuilder sb=new StringBuilder();
//        if (subtree!=null) {//�ݹ��������
//            sb.append(subtree.data).append(",");
//            //����������
//            sb.append(preOrder(subtree.left));
//            //����������
//            sb.append(preOrder(subtree.right));
//        }
//        return sb.toString();
//    }
//
//
//    @Override
//    public String inOrder() {
//        String sb=inOrder(root);
//        if(sb.length()>0){
//            //ȥ��β��","��
//            sb=sb.substring(0,sb.length()-1);
//        }
//        return sb;
//    }
//
//    /**
//     * �и�����
//     * Blog : http://blog.csdn.net/javazejian [ԭ�ĵ�ַ,������ԭ��]
//     * @return
//     */
//    public String inOrder(BinaryNode<T> subtree) {
//        StringBuilder sb=new StringBuilder();
//        if (subtree!=null) {//�ݹ��������
//            //�ȱ���������
//            sb.append(inOrder(subtree.left));
//            //�ٱ��������
//            sb.append(subtree.data).append(",");
//            //������������
//            sb.append(inOrder(subtree.right));
//        }
//        return sb.toString();
//    }
//
//    @Override
//    public String postOrder() {
//        String sb=postOrder(root);
//        if(sb.length()>0){
//            //ȥ��β��","��
//            sb=sb.substring(0,sb.length()-1);
//        }
//
//        return sb;
//    }
//
//    /**
//     * �������
//     * Blog : http://blog.csdn.net/javazejian [ԭ�ĵ�ַ,������ԭ��]
//     * @param subtree
//     * @return
//     */
//    public String postOrder(BinaryNode<T> subtree) {
//        StringBuilder sb=new StringBuilder();
//        if (subtree!=null) {//�ݹ��������
//            //�ȱ���������
//            sb.append(postOrder(subtree.left));
//
//            //�ٱ���������
//            sb.append(postOrder(subtree.right));
//
//            //�����������
//            sb.append(subtree.data).append(",");
//        }
//        return sb.toString();
//    }
//
//    /**
//     * �ǵݹ���ȸ�����
//     * @return
//     */
//    public String preOrderTraverse(){
//        StringBuffer sb=new StringBuffer();
//        //�������ڴ�Ž���ջ
//        LinkedStack<BinaryNode<T>> stack=new LinkedStack<>();
//
//        BinaryNode<T> p=this.root;
//
//        while (p!=null||!stack.isEmpty()){
//
//            if (p!=null){
//                //���ʸý��
//                sb.append(p.data+",");
//
//                //���ѷ��ʹ��Ľ����ջ
//                stack.push(p);
//
//                //��������������
//                p=p.left;
//
//            }else { //��p=null ջ��Ϊ��,��˵������������������һ��·��, ��ջ�е���ջ�����,���������Һ���
//                p=stack.pop();
//                p=p.right;
//            }
//
//        }
//        //ȥ�����һ������
//        if(sb.length()>0){
//            return sb.toString().substring(0,sb.length()-1);
//        }else {
//            return sb.toString();
//        }
//    }
//
//    /**
//     * �ǵݹ���и�����
//     * Blog : http://blog.csdn.net/javazejian [ԭ�ĵ�ַ,������ԭ��]
//     * @return
//     */
//    public String inOrderTraverse(){
//        StringBuffer sb=new StringBuffer();
//        //�������ڴ�Ž���ջ
//        LinkedStack<BinaryNode<T>> stack=new LinkedStack<>();
//
//        BinaryNode<T> p=this.root;
//
//        while (p!=null||!stack.isEmpty()){
//            while (p!=null){//�����Ӷ���ջ,��������Ϊnull
//                stack.push(p);
//                p=p.left;
//            }
//            //���ջ��Ϊ��,��Ϊǰ��������ȫ����ջ
//            if(!stack.isEmpty()){
//                p=stack.pop();
//                //����p���
//                sb.append(p.data+",");
//                //����p�����Һ���
//                p=p.right;
//            }
//        }
//
//        if(sb.length()>0){
//            return sb.toString().substring(0,sb.length()-1);
//        }else {
//            return sb.toString();
//        }
//    }
//
//    /**
//     * �ǵݹ�������
//     * @return
//     */
//    public String postOrderTraverse(){
//        StringBuffer sb=new StringBuffer();
//        //�������ڴ�Ž���ջ
//        LinkedStack<BinaryNode<T>> stack=new LinkedStack<>();
//
//        BinaryNode<T> currentNode =this.root;
//        BinaryNode<T> prev=this.root;
//
//        while (currentNode!=null||!stack.isEmpty()){
//            //������������ջ��,ֱ��Ҷ�ӽ��Ϊֹ
//            while (currentNode!=null){
//                stack.push(currentNode);
//                currentNode=currentNode.left;
//            }
//
//            //��ʼ���ʵ�ǰ���ĸ�����Һ���
//            if(!stack.isEmpty()){
//                //��ȡ�Һ���
//                BinaryNode<T> temp=stack.peek().right;
//                //���ж��Ƿ����Һ��ӻ����Һ����Ƿ��ѱ����ʹ�
//                if(temp==null||temp==prev){//û���Һ���||�Һ����ѱ����ʹ�
//                    //���û���Һ��ӻ����Һ����ѱ�����,�򵯳�����㲢����
//                    currentNode=stack.pop();
//                    //����
//                    sb.append(currentNode.data+",");
//                    //��¼�ѷ��ʹ��Ľ��
//                    prev=currentNode;
//                    //�ÿյ�ǰ���
//                    currentNode=null;
//                }else {
//                    //���Һ���,��ʼ����������
//                    currentNode=temp;
//                }
//            }
//
//        }
//
//        //ȥ�����һ������
//        if(sb.length()>0){
//            return sb.toString().substring(0,sb.length()-1);
//        }else {
//            return sb.toString();
//        }
//    }
//
//
//    /**
//     * ��α���
//     * @return
//     */
//    @Override
//    public String levelOrder() {
//        /**
//         * �����Ҫ�����Ľ��,����һ�������ҽڵ����
//         */
//        LinkedQueue<BinaryNode<T>> queue=new LinkedQueue<>();
//        StringBuffer sb=new StringBuffer();
//        BinaryNode<T> p=this.root;
//
//        while (p!=null){
//            //��¼�����Ľ��
//            sb.append(p.data);
//
//            //�Ȱ���α������,����һ�����ҽ��֮ǰ����
//            if(p.left!=null){
//                //���ӽ�����
//                queue.add(p.left);
//            }
//
//            if (p.right!=null){
//                queue.add(p.right);
//            }
//            //������һ�����
//            p=queue.poll();
//        }
//
//        return sb.toString();
//    }
//
//    @Override
//    public void insert(T data) {
//        if (data==null)
//            throw new RuntimeException("data can\'Comparable be null !");
//        //�������
//        root=insert(data,root);
//    }
//
//    @Override
//    public void remove(T data) {
//        if(data==null)
//            throw new RuntimeException("data can\'Comparable be null !");
//        //ɾ�����
//        root=remove(data,root);
//    }
//
//    @Override
//    public T findMin() {
//        if(isEmpty())
//            throw new EmptyTreeException("BinarySearchTree is empty!");
//
//        return findMin(root).data;
//    }
//
//    @Override
//    public T findMax() {
//        if(isEmpty())
//            throw new EmptyTreeException("BinarySearchTree is empty!");
//
//        return findMax(root).data;
//    }
//
//    @Override
//    public BinaryNode<T> findNode(T data) {
//        return findNode(data,root);
//    }
//
//    /**
//     * �ж���T���Ƿ����data
//     * @param data
//     * @return
//     */
//    @Override
//    public boolean contains(T data) {
//        return contains(data,root);
//    }
//
//    /**
//     * �������,�ݹ�ʵ��
//     * @param data
//     * @param p
//     * @return
//     */
//    private BinaryNode<T> insert(T data,BinaryNode<T> p){
//        if(p==null){
//            p=new BinaryNode<>(data,null,null);
//        }
//
//        int compareResult=data.compareTo(p.data);
//
//        if (compareResult<0){//��
//            p.left=insert(data,p.left);
//        }else if(compareResult>0){//��
//            p.right=insert(data,p.right);
//        }else {
//            ;//����Ԫ�ؾ�û��Ҫ�ظ�������
//        }
//        return p;
//    }
//
//
//
//    /**
//     * ��3�����
//     * 1.ɾ��Ҷ�ӽ��(Ҳ����û�к��ӽ��)
//     * 2.ɾ��ӵ��һ�����ӽ��Ľ��(����������Ҳ�������Һ���)
//     * 3.ɾ��ӵ���������ӽ��Ľ��
//     * @param data
//     * @param p
//     * @return
//     */
//    private BinaryNode<T> remove(T data,BinaryNode<T> p){
//        //û���ҵ�Ҫɾ����Ԫ��,�ݹ����
//        if (p==null){
//            return p;
//        }
//        int compareResult=data.compareTo(p.data);
//
//        if (compareResult<0){//��߲���ɾ�����
//            p.left=remove(data,p.left);
//        }else if (compareResult>0) {
//            p.right=remove(data,p.right);
//        }else if (p.left!=null&&p.right!=null){//���ҵ���㲢�ж��Ƿ��������ӽ��(���3)
//            //�м��滻,�ҵ�����������С��Ԫ�ز��滻��Ҫɾ����Ԫ��ֵ
//            p.data = findMin( p.right ).data;
//            //�Ƴ������滻�Ľ��
//            p.right = remove( p.data, p.right );
//        }else {
//
//            p=(p.left!=null)? p.left : p.right;
//        }
//
//        return p;//���ظý��
//    }
//
//    /**
//     * �ǵݹ�ɾ��
//     * @param data
//     */
//    public boolean removeUnrecure(T data){
//        if (data==null){
//            throw new RuntimeException("data can\'Comparable be null !");
//        }
//        //�Ӹ���㿪ʼ����
//        BinaryNode<T> current =this.root;
//        //��¼�����
//        BinaryNode<T> parent=this.root;
//        //�ж����Һ��ӵ�flag
//        boolean isLeft=true;
//
//
//        //�ҵ�Ҫɾ���Ľ��
//        while (data.compareTo(current.data)!=0){
//            //���¸�����¼
//            parent=current;
//            int result=data.compareTo(current.data);
//
//            if(result<0){//������������
//                isLeft=true;
//                current=current.left;
//            }else if(result>0){//������������
//                isLeft=false;
//                current=current.right;
//            }
//            //���û���ҵ�,����null
//            if (current==null){
//                return false;
//            }
//        }
//
//        //----------������˵�����ҵ�Ҫɾ���Ľ��
//
//        //ɾ������Ҷ�ӽ��
//        if (current.left==null&&current.right==null){
//            if (current==this.root){
//                this.root=null;
//            } else if(isLeft){
//                parent.left=null;
//            }else {
//                parent.right=null;
//            }
//        }
//        //ɾ������һ�����ӽ��Ľ��,��current��right��Ϊnull
//        else if (current.left==null){
//            if (current==this.root){
//                this.root=current.right;
//            }else if(isLeft){//currentΪparent������
//                parent.left=current.right;
//            }else {//currentΪparent���Һ���
//                parent.right=current.right;
//            }
//        }
//        //ɾ������һ�����ӽ��Ľ��,��current��left��Ϊnull
//        else if(current.right==null){
//            if (current==this.root){
//                this.root=current.left;
//            }else if (isLeft){//currentΪparent������
//                parent.left=current.left;
//            }else {//currentΪparent���Һ���
//                parent.right=current.left;
//            }
//        }
//        //ɾ�������������ӽ��Ľ��
//        else {
//            //�ҵ���ǰҪɾ�����current���������е���СֵԪ��
//            BinaryNode<T> successor= findSuccessor(current);
//
//            if(current == root) {
//                this.root = successor;
//            } else if(isLeft) {
//                parent.left = successor;
//            } else{
//                parent.right = successor;
//            }
//            //�ѵ�ǰҪɾ���Ľ������Ӹ�ֵ��successor
//            successor.left = current.left;
//        }
//        return true;
//    }
//
//    /**
//     * �����м̽��--��������Сֵ���
//     * @param delNode Ҫɾ���Ľ��
//     * @return
//     */
//    public BinaryNode<T> findSuccessor(BinaryNode<T> delNode) {
//        BinaryNode<T> successor = delNode;
//        BinaryNode<T> successorParent = delNode;
//        BinaryNode<T> current = delNode.right;
//
//        //���ϲ�������,ֱ��Ϊ��,��successorΪ��Сֵ���
//        while(current != null) {
//            successorParent = successor;
//            successor = current;
//            current = current.left;
//        }
//        //���Ҫɾ�������Һ�����successor�����,��ִ�����²���(����൱,��˵��ɾ�����)
//        if(successor != delNode.right) {
//            successorParent.left = successor.right;
//            //���м̽����Һ���ָ��ǰҪɾ�������Һ���
//            successor.right = delNode.right;
//        }
//        return successor;
//    }
//
//
//    /**
//     * ������Сֵ���
//     * @param p
//     * @return
//     */
//    private BinaryNode<T> findMin(BinaryNode<T> p){
//
//        if (p==null)//��������
//            return null;
//        else if (p.left==null)//���û������,��ôt������С��
//            return p;
//        return findMin(p.left);
//    }
//
//    /**
//     * �������ֵ���
//     * @param p
//     * @return
//     */
//    private BinaryNode<T> findMax(BinaryNode<T> p){
//        if (p==null)//��������
//            return null;
//        else if (p.right==null)
//            return p;
//        return findMax(p.right);
//    }
//
//
//    /**
//     * ����data���ҽ��
//     * @param data
//     * @param p
//     * @return
//     */
//    private BinaryNode<T> findNode(T data,BinaryNode<T> p){
//
//        if (p==null||data==null){
//            return null;
//        }
//        //����ȽϽ��
//        int compareResult=data.compareTo(p.data);
//
//        if (compareResult<0){//������������
//            return findNode(data,p.left);
//        }else if(compareResult>0){//������������
//            return findNode(data,p.right);
//        }else {//match
//            return p;
//        }
//    }
//
//
//    private boolean contains(T data,BinaryNode<T> p) {
//
//        if (p==null||data==null){
//            return false;
//        }
//
//        //����ȽϽ��
//        int compareResult=data.compareTo(p.data);
//        //���С��0,������������
//        if(compareResult<0){
//            return contains(data,p.left);
//        }else if(compareResult>0){
//            return contains(data,p.right);
//        }else {
//             return true;   //match
//        }
//    }
//
//    @Override
//    public void clear() {
//        root =null;
//    }
//
//
//    private void printTree( BinaryNode t )
//    {
//        if( t != null )
//        {
//            printTree( t.left );
//            System.out.println( t.data );
//            printTree( t.right );
//        }
//    }
//
//
//    /**
//     *
//     * ����ת�����ַ�������ӡ�ڿ���̨�ϣ���L��ʾ���ӣ�R��ʾ�Һ���
//     */
//    public void print() {
//        LinkedList<BinaryNode<T>> tree = getCompleteBinaryTree();
//        //��ȡ�������
//        int depth = height();
//        Iterator<BinaryNode<T>> iterator = tree.iterator();
//
//        int maxPosition = 1;
//
//        for (int floor = 1; floor <= depth; floor++) { // ��������1��ʼ
//            maxPosition = 1 << (floor - 1);//�����൱��1*2^(floor-1)
//
//            //���Ԫ��ǰ��Ҫ��ӡ�Ŀհ׷�
//            //�����൱��1*2^( depth - floor ) - 1
//            printBlank((1 << (depth - floor)) - 1);
//
//            //��ʼ��ӡԪ��
//            for (int position = 0; position < maxPosition; position++) {
//                if (iterator.hasNext()) {
//                    BinaryNode<T> node = iterator.next();
//                    if (node != null) {
//                        System.out.print(node.data);
//                    } else {
//                        System.out.print(" ");
//                    }
//                    //�ٴδ�ӡ����հ׷�
//                    printBlank((1 << (depth - floor + 1)) - 1);
//                }
//            }
//            //����
//            System.out.println();
//
//        }
//    }
//
//    /**
//     * ��ӡ�հ�
//     * @param length
//     */
//    private void printBlank(int length) {
//        while (length-- > 0) {
//            System.out.print(" ");
//        }
//    }
//
//    /*
//     * ���������ÿսڵ㲹�����ȫ������������ˮƽ������ʽ����
//     */
//    private LinkedList<BinaryNode<T>> getCompleteBinaryTree() {
//        Queue<BinaryNode<T>> queue = new LinkedList<>();
//        LinkedList<BinaryNode<T>> tree = new LinkedList<>(); // �����������ȫ���������������������
//        queue.add(root);
//        BinaryNode<T> empty = null;
//        int nodeCount = 1; // �����зǿսڵ���
//        while (queue.size() > 0 && nodeCount > 0) {
//            BinaryNode<T> node = queue.remove();
//            if (node != null) {
//                nodeCount--;
//                tree.add(node);
//                BinaryNode<T> left = node.left;
//                BinaryNode<T> right = node.right;
//                if (left == null) {
//                    queue.add(empty);
//                } else {
////                    queue.add(linkFlag);
//                    queue.add(left);
//                    nodeCount++;
//                }
//                if (right == null) {
//                    queue.add(empty);
//                } else {
//                    queue.add(right);
//                    nodeCount++;
//                }
//            } else {
//                tree.add(empty);
//                queue.add(empty);
//                queue.add(empty);
//            }
//        }
//        return tree;
//    }
//
//    /**
//     * ����
//     * @param args
//     */
//    public static void main(String args[])
//    {
//        Integer pre[] = {1,2,4,7,3,5,8,9,6};
//        Integer in[]  = {4,7,2,1,8,5,9,3,6};
//
//        String[] preList={"A","B","D","G","C","E","F","H"};
//        String[] inList={"D","G","B","A","E","C","H","F"};
//        String[] postList={"G","D","B","E","H","F","C","A"};
//        /**
//         * �ȸ�����:A,B,D,G,C,E,F,H
//         * �и�����:D,G,B,A,E,C,H,F
//         * �������:G,D,B,E,H,F,C,A
//         */
//        //�ȸ�/�и�
////        BinarySearchTree<String> cbtree = new BinarySearchTree<>(preList,inList,true);
//        //���/�и�
//        BinarySearchTree<String> cbtree = new BinarySearchTree<>(postList,inList,false);
////        BinarySearchTree<String> cbtree = new BinarySearchTree<>();
////        cbtree.printTree(cbtree.root);
////        BinarySearchTree<Integer> cbtree = new BinarySearchTree<>();
////        cbtree.insert(10);
////        cbtree.insert(40);
////        cbtree.insert(2);
////        cbtree.insert(90);
////        cbtree.insert(11);
////        cbtree.insert(9);
////        cbtree.insert(30);
////        cbtree.insert("A");
////        cbtree.insert("B");
////        cbtree.insert("C");
////        cbtree.insert("D");
////        cbtree.insert("E");
////        cbtree.insert("F");
//        System.out.println("�ȸ�����:"+cbtree.preOrder());
////        System.out.println("�ǵݹ��ȸ�����:"+cbtree.preOrderTraverse());
//        System.out.println("�и�����:"+cbtree.inOrder());
////        System.out.println("�ǵݹ��и�����:"+cbtree.inOrderTraverse());
//        System.out.println("�������:"+cbtree.postOrder());
////        System.out.println("�ǵݹ�������:"+cbtree.postOrderTraverse());
////        System.out.println("���������(��������������):"+cbtree.findMax());
////        System.out.println("������С���(��������������):"+cbtree.findMin());
////        System.out.println("�ж϶��������Ƿ����E:"+cbtree.contains("E"));
////        System.out.println("ɾ���Ľ�㷵�ظ����:"+cbtree.remove("E",cbtree.root).data);
////
////        System.out.println("findNode->"+cbtree.findNode("D",cbtree.root).data);
////        System.out.println("ɾ��E���:�ȸ�����:" + cbtree.preOrder());
//          System.out.println("���Ľṹ����:");
//          cbtree.print();
//
//    }
//}