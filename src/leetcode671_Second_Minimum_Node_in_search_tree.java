/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月17日 上午11:42:58
* 类说明: 
*/
public class leetcode671_Second_Minimum_Node_in_search_tree {
	int min = Integer.MAX_VALUE;
	int second_min = Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public  int findSecondMinimumValue(TreeNode root) {
        search1(root);
        search2(root);
        if (second_min != Integer.MAX_VALUE){
        	return second_min;
        }
        else {
        	return -1;
        }
    }
	public void search1(TreeNode root){
		if (root != null){
			min = Math.min(min, root.val);
			search1(root.left);
			search1(root.right);
		}
	}
	public void search2(TreeNode root){
		if (root != null){
			if (root.val > min){
				second_min = Math.min(second_min, root.val);
			}
			search2(root.left);
			search2(root.right);
		}
	}

}
