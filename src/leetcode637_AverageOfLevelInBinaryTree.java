import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array. 
 * @author Administrator
 *
 */
public class leetcode637_AverageOfLevelInBinaryTree {

	public static void main(String[] args) {
		
	}
    public static List<Double> averageOfLevels(TreeNode root) {
    	List<Integer> count = new ArrayList<Integer>();
    	List<Double> res = new ArrayList<Double>();
    	
    	average(root, 0, res, count);
    	for (int i = 0; i < res.size(); i++){
    		res.set(i, res.get(i)/count.get(i));
    	}
    	return res;
    }
    public static void average(TreeNode node, int i,List<Double> sum,List<Integer> count){
    	if (node == null){
    		return ;
    	}
    	
    	if (i < sum.size()){
    		sum.set(i, sum.get(i) + node.val);
    		count.set(i, count.get(i) + 1);
    	}
    	else {
			sum.add(1.0*node.val);
			count.add(1);
		}
    	average(node.left, i + 1, sum, count);
    	average(node.right, i + 1, sum, count);
    	
    }
    public class TreeNode {
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x) { val = x; }
    }

}
