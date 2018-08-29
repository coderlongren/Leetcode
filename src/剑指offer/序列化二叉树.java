package 剑指offer;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月16日 下午6:07:14
* 类说明: 
*/
public class 序列化二叉树 {
	public static void main(String[] args) {
		
	}
	public static String serialize(TreeNode root) {
		if (root == null) {
			return "";
		}
		StringBuilder builder = new StringBuilder();
		serialize2(root, builder);
		return builder.toString();
	}
	public static void serialize2(TreeNode root, StringBuilder builder) {
		if (root == null) {
			builder.append("#,");
			return;
		}
		builder.append(root.val);
		serialize2(root.left, builder);
		serialize2(root.right, builder);
	}
} 
