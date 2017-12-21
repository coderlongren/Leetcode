import java.util.Map;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��20�� ����5:06:52
* ��˵��: ��ǰ����Pathsum����ͬ���ǣ�ǰ���������󵽴�Ҷ�ӽڵ��·�������
*  û��Ҫ����뵽��Ҷ�ӽڵ㣬��Ȼֻ���������·���������������Ѷ�
*/
public class leetcode437_Path_sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "abc";
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(3);
		root.right.right.right = new TreeNode(4);
		System.out.println(path(root, 3));
		
	}
	public static int pathSum(TreeNode root, int sum) {
		if (root == null){
			return 0;
		}
		return path(root, sum) + path(root.left, sum) + path(root.right, sum) + path(root, sum);
    }
	public static int path(TreeNode root,int sum){
		if (root == null){
			return 0;
		}
		if(root.val == sum){
			return 1 + path(root.left, sum - root.val) + path(root.right, sum - root.val);
		}
		else{
			return path(root.left, sum - root.val) + path(root.right, sum - root.val);
		}
		
//		return path(root.left, sum - root.val) + path(root.right, sum - root.val);
//		���ش���
	}

}
