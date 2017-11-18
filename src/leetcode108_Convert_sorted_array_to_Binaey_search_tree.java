import java.lang.reflect.Constructor;

public class leetcode108_Convert_sorted_array_to_Binaey_search_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//又是使用递归函数的 题目 
	 public TreeNode sortedArrayToBST(int[] nums) {
		 if (nums.length == 0){
			 return null;
		 }
	    TreeNode head = construct(nums,0,nums.length - 1);
	    
		return head; 
	 }
	 public static TreeNode construct(int[] nums,int low,int high){
		 if (low > high){
			 return null;
		 }
		 int mid = (low + high)/2;
		 TreeNode head = new TreeNode(nums[mid]);
		 head.left = construct(nums, low, mid - 1);
		 head.right = construct(nums, mid + 1, high);
		 
		 return head;
	 }

}
