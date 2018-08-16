package 剑指offer;

import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年8月6日 下午4:28:36
* 类说明: 
*/
public class VerifySquenceOfBST {
	public static void main(String[] args) {
		
	}
	public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) {
			return false;
		}
		return judge(sequence, 0, sequence.length - 1);
    }
    public boolean judge(int[] a, int l, int r) {
		if (l >= r) {
			return true;
		}
		int i = r; //  r 肯定是 root节点, r - 1 节点是右子树的一个节点
		while (i > l && a[i - 1] > a[r]) {
			i--;
		}
		// 左子树的所有元素 必须都大于 root节点
		for (int j = i - 1; j >= l; j--) {
			if (a[j] > a[r]) {
				return false;
			}
		}
		return judge(a, l, i - 1) && judge(a, i, r - 1);
	}
}
