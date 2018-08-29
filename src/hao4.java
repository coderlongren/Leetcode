import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月28日 下午8:51:28
* 类说明: 
*/
public class hao4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		String[] arr = line.split(" ");
		boolean[] flag = new boolean[10];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("1")) {
				flag[i] = true;
			}
		}
		List<Integer> nomust = new ArrayList<>();
		List<Integer> must = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			if (flag[i]) {
				must.add(i);
			}
			else {
				nomust.add(i);
			}
		}
		nomust.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		});
		
		int[] nums = new int[nomust.size()];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nomust.get(i);
		}
		List<List<Integer>> res = subsetsWithDup(nums);
		List<Integer> resu = new ArrayList<>();
		for (List<Integer> item : res) {
			List<Integer> temp = new ArrayList<>(must);
			for (Integer  ii : item) {
				temp.add(ii);
			}
			temp.sort(new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o1 - o2;
				}
			});
			String string = "";
			for (Integer iiInteger : temp) {
				string += iiInteger;
			}
			resu.add(Integer.valueOf(string));
		}
		resu.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		});
		if (!flag[0]) {
			for (int i = 0; i < resu.size(); i++) {
				if (i == 0 || i == 2) {
					System.out.println("0" + resu.get(i));
				}
				else {
					System.out.println(resu.get(i));
				}
			}
		}
		else {
			for (int i = 0; i < res.size(); i++) {
					System.out.println(resu.get(i));
				}
			}
		}
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }
	public static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums,int start) {
		list.add(new ArrayList<>(tempList));
		
		for (int i = start; i < nums.length; i++) {
			if (i > start && nums[i] == nums[i - 1]) {
				continue;
			}
			tempList.add(nums[i]);
			backtrack(list, tempList, nums, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}
}
