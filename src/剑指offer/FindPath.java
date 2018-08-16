package 剑指offer;

import java.util.ArrayList;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月6日 下午4:55:40
* 类说明: 
*/
public class FindPath {
	
	public ArrayList<ArrayList<Integer>> allPath = new ArrayList<>();
    public ArrayList<Integer> list = new ArrayList<>();
    
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if (root == null) {
            return allPath;
        }
        
        list.add(root.val);
        target -= root.val;
        if (root.left == null && root.right == null && target == 0) {
            allPath.add(new ArrayList(list));
        }
        
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size() - 1);
        return allPath;
    }
}
