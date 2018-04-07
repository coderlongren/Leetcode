package ����ͷ��;

import leetcodeContest71.TreeNode;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��4��7�� ����1:36:51
* ��˵��: 
*/
public class ���л������� {
	public static int index = -1;
	// ͨ��ǰ�������˳�� , ���л�Ϊһ���ַ���
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
		 index++;//����ָ����ÿ������һλ
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
