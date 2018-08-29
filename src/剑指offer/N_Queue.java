package 剑指offer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月24日 上午11:12:01
* 类说明:  这是一道使用了 回溯法 解决N皇后问题的经典答案，
*  除了使用回溯法之外，我们还可以使用 DP动态规划的方法来做这个事情，但是从我的个人角度来看的话，回溯法是
*  我最容易接受的方法，因为
*  1. 回溯法 是欲求目标，得到了问题的限制条件
*  2. row[i] = false left[rowIndex + i] = false right[rowIndex - i + n * 1] = false
*  3. 按照这个条件 跳出循环的条件是 rowIndex == n 因为所有的行都已经遍历到了， 直接回溯
*  4. 除了这个先决条件，我们要做的就是在回溯之前，加上限制条件，在回溯之后，把前面加上的限制条件去除即可。
*/
public class N_Queue {
	public static void main(String[] args) {
		List<List<String>> res = getSolutionNQueue(8);
		for (List<String> item : res) {
			for (String string : item) {
				System.out.println(string);
			}
		}
		System.out.println(res.size() + "解决方案");
	}
	public static List<List<String>> getSolutionNQueue(int n) {
		int rowIndex = 0;
		List<List<String>> res = new ArrayList<>();
		boolean[] row = new boolean[n]; // row 记忆
		boolean[] left = new boolean[2 * n]; // 左下角 记忆
		boolean[] right = new boolean[2 * n]; // 右下角 记忆
		backtrack(res, new ArrayList<>(), row, left, right, rowIndex, n);
		return res;
	}
	public static void backtrack(List<List<String>> res, ArrayList<String> temp, boolean[] row, boolean[] left, boolean[] right, int rowIndex, int n) {
		
		if (rowIndex == n) {
			res.add(new ArrayList<>(temp));
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (row[i] || left[i + rowIndex] || right[rowIndex - i + n - 1]) {
				continue;
			}
			
			row[i] = true;
			left[i + rowIndex] = true;
			right[rowIndex - i + n - 1] = true;
			
			char[] tempString = new char[n];
			Arrays.fill(tempString, '.');
			tempString[i] = '*';
			String string = "";
			for (char c : tempString) {
				string += c + "";
			}
			temp.add(string);
			backtrack(res, temp, row, left, right, rowIndex + 1, n);
			row[i] = false;
			left[i + rowIndex] = false;
			right[rowIndex - i + n - 1] = false;
			temp.remove(temp.size() - 1);
		}
	}
}
