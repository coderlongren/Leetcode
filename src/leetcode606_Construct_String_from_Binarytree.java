/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��13�� ����5:07:01
* ��˵��: 
* You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.

The null node needs to be represented by empty parenthesis pair "()".
 And you need to omit all the empty parenthesis pairs that don't affect 
 the one-to-one mapping relationship between the string and the original binary tree.
*/
public class leetcode606_Construct_String_from_Binarytree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// DFS ����򵥵Ľⷨ
	 public static String tree2str(TreeNode t) {
		 // ����Ӧ�ô� ��Ҷ�ӽڵ㿪ʼ����
		 if (t == null){
			 return "";
		 }
		 String res = t.val + "";
		 String left = tree2str(t.left);
		 String right = tree2str(t.right);
		 // �������һ��Ҷ�ӽڵ� ֱ�ӷ�������Val�ַ���������
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
