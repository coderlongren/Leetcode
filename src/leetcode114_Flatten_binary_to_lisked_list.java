/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月17日 下午10:05:40
* 类说明: 
*/
public class leetcode114_Flatten_binary_to_lisked_list {
	private TreeNode prev = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public void flatten(TreeNode root) {
    	if (root == null) {
    		return;
    	}
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }

}
