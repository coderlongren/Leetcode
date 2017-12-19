import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2017年12月19日 下午10:52:52
* 类说明: 
*/
public class leetcode113_Path_sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static List<List<Integer>> pathSum(TreeNode root, int sum) {
	     List<List<Integer>> list = new ArrayList<>();
//	     if (root.left == null && root.right == null && )
	     return hasPath(root, sum, list);
	  }
	 public static List<List<Integer>> hasPath(TreeNode root,int sum,List<List<Integer>> list){
		 if (root == null){
			 ;
		 }
		 list.add(list)
		 
		return list;
		 
	 }
}
