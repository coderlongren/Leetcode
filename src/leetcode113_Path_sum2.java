import java.util.ArrayList;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2017��12��19�� ����10:52:52
* ��˵��: 
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
