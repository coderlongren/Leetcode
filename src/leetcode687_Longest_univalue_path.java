/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��13�� ����10:33:33
* ��˵��: 
*/
public class leetcode687_Longest_univalue_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leetcode687_Longest_univalue_path leetcode687_Longest_univalue_path = new leetcode687_Longest_univalue_path();
		leetcode687_Longest_univalue_path.longestUnivaluePath(null);
	}
	//  ʹ��DFS��˼· ʹ���Ƕ����뵽�ģ�������μ��������ͬ��
	public  int longestUnivaluePath(TreeNode root) {
		int[] a = {0};
		if (root != null){
	         DFS(root,a);   
	    };
//		System.out.println(a.val);
		return a[0];
    }
	public  int DFS(TreeNode root,int[] a){
		// ����Ҫ����� ��� i,j resL,resR ���״���ʲô��˼��
		int l = root.left == null? 0 : DFS(root.left,a); // i ������Ϊ�� �������������Ҫ��� ·������
		int r = root.right == null? 0: DFS(root.right,a); // j ���� �������������Ҫ��� ·������
		
		int resL = root.left != null && root.val == root.left.val ? l + 1 : 0;  // resL ������ڵ����������ȣ���ô������·����һ
		int resR = root.right != null &&  root.val == root.right.val ? r + 1 : 0; //resR ������ڵ����������ȣ���ô������·����һ
		
		a[0] = Math.max(a[0], resL + resR);
		return Math.max(resL, resR);
		
	}
}
