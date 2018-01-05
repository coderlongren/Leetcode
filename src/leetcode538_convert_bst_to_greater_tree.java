/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月5日 下午10:12:08
* 类说明:   看了top commit才知道自己的算法是多么的愚蠢，厉害了。
*/
public class leetcode538_convert_bst_to_greater_tree {
	int sum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leetcode538_convert_bst_to_greater_tree leetcode538_ConvertBSTtoGreaterTree = new leetcode538_convert_bst_to_greater_tree();
		TreeNode root = new TreeNode(5);
		root.right =  new TreeNode(13);
		root.left = new TreeNode(2);
		leetcode538_ConvertBSTtoGreaterTree.convertBST(root);
	}
 
    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }
    
    public void convert(TreeNode cur) {
        if (cur == null) return;
        convert(cur.right);
        cur.val += sum;
        sum = cur.val;
        convert(cur.left);
    }

}
