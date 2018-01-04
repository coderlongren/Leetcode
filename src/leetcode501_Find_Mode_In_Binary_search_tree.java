import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月3日 下午9:10:23
* 类说明: 
*/
public class leetcode501_Find_Mode_In_Binary_search_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	 public static int[] findMode(TreeNode root) {
		 Map<Integer, Integer> map = new HashMap<>();
		 search(root, map);
		 int max = Integer.MIN_VALUE;
		 for (Integer integer : map.values()) {
			max = Math.max(max, integer);
		}
		 List<Integer> res = new LinkedList<>();
		 for (Integer integer : map.keySet()) {
			if (map.get(integer) == max){
				res.add(integer);
			}
		}
		Integer[] a = (Integer[])res.toArray(new Integer[res.size()]);
//		int[] b = Arrays.copyOf(original, newLength)
		
		int[] c =  new int[a.length];
		for (int i = 0; i < a.length; i++){
			c[i] = a[i];
		}
		 return c;
	 }
	 public static void search(TreeNode root,Map<Integer, Integer> map){
		 if (root != null){
			 if (!map.keySet().contains(root.val)){
				 map.put(root.val, 1);
			 }
			 else {
				 map.put(root.val, map.get(root.val) + 1);
			 }
			 search(root.left, map);
			 search(root.right, map);
		 }
	 }

}
