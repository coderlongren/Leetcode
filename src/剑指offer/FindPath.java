package ��ָoffer;

import java.util.ArrayList;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��6�� ����4:55:40
* ��˵��: 
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
