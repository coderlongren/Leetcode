package leetcodeContest89;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��17�� ����1:27:11
* ��˵��: 
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
	// �򵥵��������⣬Ҳ����BFS 
	public static int search(char[] now, char[] target, int i, int swap) {
		// search �������
		if (i >= target.length) {
			return swap;
		}
		if (now[i] == target[i]) {
			return search(now, target, i + 1, swap);
		}
		int min = Integer.MAX_VALUE;
		for (int j = i + 1; j < target.length; j++) {
			if (now[j] != target[i]) { // 
				continue; // ����search
			}
			//��i ���ҵ��˵�һ�� == target[i]��char
			swap(now, i, j);
			min = Math.min(min, search(now, target, i + 1, swap + 1)); // ������һ��
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
