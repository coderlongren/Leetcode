package leetcodeContest89;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月17日 下午1:27:11
* 类说明: 
*/
public class leetcode854_K_Similar_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "abac";
		String B = "baca";
		System.out.println(kSimilarity(A, B));
	}
	public static int kSimilarity(String A, String B) {
		char[] a = A.toCharArray();
		char[] b = B.toCharArray();
		return search(a, b, 0, 0); 
	}
	// 简单的搜索问题，也可以BFS 
	public static int search(char[] now, char[] target, int i, int swap) {
		// search 到了最后
		if (i >= target.length) {
			return swap;
		}
		if (now[i] == target[i]) {
			return search(now, target, i + 1, swap);
		}
		int min = Integer.MAX_VALUE;
		for (int j = i + 1; j < target.length; j++) {
			if (now[j] != target[i]) { // 
				continue; // 继续search
			}
			//在i 后找到了第一个 == target[i]的char
			swap(now, i, j);
			min = Math.min(min, search(now, target, i + 1, swap + 1)); // 交换了一次
			swap(now, j, i);
		}
		return min;
	}
	public static void swap(char[] a, int i, int j){
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
