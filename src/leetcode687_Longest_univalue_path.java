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
		A a = new A(0);
		DFS(root,a);
//		System.out.println(a.val);
		return a.val;
    }
	public  int DFS(TreeNode root,A a){
		// ����Ҫ����� ��� i,j resL,resR ���״���ʲô��˼��
		int l = root.left == null? 0 : DFS(root.left,a); // i ������Ϊ�� �������������Ҫ��� ·������
		int r = root.right == null? 0: DFS(root.right,a); // j ���� �������������Ҫ��� ·������
		
		int resL = root.val == root.left.val ? l + 1 : 0;  // resL ������ڵ����������ȣ���ô������·����һ
		int resR = root.val == root.right.val ? r + 1 : 0; //resR ������ڵ����������ȣ���ô������·����һ
		
		a.val = Math.max(a.val, resL + resR);
		return resL + resR;
		
	}
	class A{
		int val;
		A(int a){
			this.val = a;
		}
	}

}
