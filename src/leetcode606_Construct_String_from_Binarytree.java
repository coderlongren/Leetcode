/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月13日 下午5:07:01
* 类说明: 
* You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.

The null node needs to be represented by empty parenthesis pair "()".
 And you need to omit all the empty parenthesis pairs that don't affect 
 the one-to-one mapping relationship between the string and the original binary tree.
*/
public class leetcode606_Construct_String_from_Binarytree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// DFS 是最简单的解法
	 public static String tree2str(TreeNode t) {
		 // 我们应该从 左叶子节点开始构造
		 if (t == null){
			 return "";
		 }
		 String res = t.val + "";
		 String left = tree2str(t.left);
		 String right = tree2str(t.right);
		 // 如果这是一个叶子节点 直接返回他的Val字符串就行了
		 if (left.equals("") && right.equals("")){
			 return res;
		 }
		 if (!left.equals("") && right.equals("")){
			 return res + "("  +left +  ")";
		 }
		 if (!right.equals("") && left.equals("")){
			
			 return res + "()" + "(" +right  + ")";
		 }
		 if (!left.equals("") && !right.equals("")){
			 return res + "("  +left +  ")" + "(" + right + ")";
		 }
		return res;
		 
		 
		 
	 }
}
