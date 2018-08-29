package ��ָoffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��24�� ����11:12:01
* ��˵��:  ����һ��ʹ���� ���ݷ� ���N�ʺ�����ľ���𰸣�
*  ����ʹ�û��ݷ�֮�⣬���ǻ�����ʹ�� DP��̬�滮�ķ�������������飬���Ǵ��ҵĸ��˽Ƕ������Ļ������ݷ���
*  �������׽��ܵķ�������Ϊ
*  1. ���ݷ� ������Ŀ�꣬�õ����������������
*  2. row[i] = false left[rowIndex + i] = false right[rowIndex - i + n * 1] = false
*  3. ����������� ����ѭ���������� rowIndex == n ��Ϊ���е��ж��Ѿ��������ˣ� ֱ�ӻ���
*  4. ��������Ⱦ�����������Ҫ���ľ����ڻ���֮ǰ�����������������ڻ���֮�󣬰�ǰ����ϵ���������ȥ�����ɡ�
*/
public class N_Queue {
	public static void main(String[] args) {
		List<List<String>> res = getSolutionNQueue(8);
		for (List<String> item : res) {
			for (String string : item) {
				System.out.println(string);
			}
		}
		System.out.println(res.size() + "�������");
	}
	public static List<List<String>> getSolutionNQueue(int n) {
		int rowIndex = 0;
		List<List<String>> res = new ArrayList<>();
		boolean[] row = new boolean[n]; // row ����
		boolean[] left = new boolean[2 * n]; // ���½� ����
		boolean[] right = new boolean[2 * n]; // ���½� ����
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
