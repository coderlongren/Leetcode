package ��ָoffer;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��16�� ����6:07:14
* ��˵��: 
*/
public class ���л������� {
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
