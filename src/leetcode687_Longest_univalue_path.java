/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月13日 下午10:33:33
* 类说明: 
*/
public class leetcode687_Longest_univalue_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leetcode687_Longest_univalue_path leetcode687_Longest_univalue_path = new leetcode687_Longest_univalue_path();
		leetcode687_Longest_univalue_path.longestUnivaluePath(null);
	}
	//  使用DFS的思路 使我们都能想到的，可是如何计算这个相同的
	public  int longestUnivaluePath(TreeNode root) {
		A a = new A(0);
		DFS(root,a);
//		System.out.println(a.val);
		return a.val;
    }
	public  int DFS(TreeNode root,A a){
		// 这里要搞清楚 这个 i,j resL,resR 到底代表什么意思？
		int l = root.left == null? 0 : DFS(root.left,a); // i 可以认为是 左子树里面符合要求的 路径数量
		int r = root.right == null? 0: DFS(root.right,a); // j 就是 右子树里面符合要求的 路径数量
		
		int resL = root.val == root.left.val ? l + 1 : 0;  // resL 如果根节点和左子树相等，那么左子树路径加一
		int resR = root.val == root.right.val ? r + 1 : 0; //resR 如果根节点和右子树相等，那么右子树路径加一
		
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
