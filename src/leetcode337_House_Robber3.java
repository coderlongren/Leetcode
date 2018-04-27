/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��24�� ����10:27:12
* ��˵��: 
*/
public class leetcode337_House_Robber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// ������ǲ�����  ���ڵĲ�ڵ�
	public int rob(TreeNode root) {
	      if (root == null) {
	    	  return 0;
	      }
	      return Math.max(robInclude(root), robExclude(root));
	 }
	// ����ڵ� �����ˣ� ����ζ�����Һ��ӽڵ㶼������
	public int robInclude(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return robExclude(root.left) + robExclude(root.right) + root.val; 
	}
	// �������ڵ� �����ٵĻ��� �������ת��Ϊ �����������ӽڵ�ĺ͵�������
	public int robExclude (TreeNode root) {
		if (root == null) {
			return 0;
		}
		return rob(root.left) + rob(root.right);
	}
	
	
}