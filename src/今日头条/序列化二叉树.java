package 今日头条;

import leetcodeContest71.TreeNode;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月7日 下午1:36:51
* 类说明: 
*/
public class 序列化二叉树 {
	public static int index = -1;
	// 通过前序遍历的顺序 , 序列化为一个字符串
	public static String Serialize(TreeNode root) {
		StringBuffer buffer = new StringBuffer();
		if (root == null) {
			buffer.append("#,");
			return buffer.toString();
		}
		buffer.append(root.val + ",");
		buffer.append(Serialize(root.left));
		buffer.append(Serialize(root.right));
		return buffer.toString();
	}
	public static TreeNode deSerialize(String s) {
		 index++;//数组指数，每次移下一位
	       int len = s.length();
	        if(index >= len){
	            return null;
	        }
	        String[] strr = s.split(",");
	        TreeNode node = null;
	        if(!strr[index].equals("#")){
	            node = new TreeNode(Integer.valueOf(strr[index]));
	            node.left = deSerialize(s);
	            node.right = deSerialize(s);
	        }        
	        return node;
	
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.left.left.left  =new TreeNode(5);
		root.left.left.left.left = new TreeNode(3);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(6);
		
		System.out.println(Serialize(root));
		TreeNode root1 = deSerialize("4,2,1,5,3,#,#,#,#,3,#,#,6,#,#,");
		System.out.println(root1.left.right.val);
		
}
}
