package ��ָoffer;

import java.util.ArrayList;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��6�� ����4:28:36
* ��˵��: 
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
		int i = r; //  r �϶��� root�ڵ�, r - 1 �ڵ�����������һ���ڵ�
		while (i > l && a[i - 1] > a[r]) {
			i--;
		}
		// ������������Ԫ�� ���붼���� root�ڵ�
		for (int j = i - 1; j >= l; j--) {
			if (a[j] > a[r]) {
				return false;
			}
		}
		return judge(a, l, i - 1) && judge(a, i, r - 1);
	}
}
