package ��ָoffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��6�� ����9:48:35
* ��˵��:  ��һ�βμ�CCF��ʱ��Ҳ����linkedList��ʵ��������ţ���ϧ��ʱʱ����ţ������ǿ��д��һ��˫��ѭ������
*  ��� һ��һ����ɾ��Ԫ�أ�����������ԭ����ʵ������򵥼���
*/
public class Լɪ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yuesefu(4, 3);
	}
	public static void yuesefu(int totalNum, int countNum) {
        // ��ʼ������
        List<Integer> start = new ArrayList<Integer>();
        for (int i = 1; i <= totalNum; i++) {
            start.add(i);
        }
        // �ӵ�K����ʼ����
        int k = 0;
        while (start.size() > 1) {
            k = k + countNum;
            // ��m�˵�����λ��
            k = k % (start.size()) - 1;// �ؼ�
            // �ж��Ƿ񵽶�β ��������˶�β����õ���k = -1
            if (k < 0) {
                System.out.println(start.get(start.size() - 1));
                start.remove(start.size() - 1);
                // ɾ���˶�βԪ��֮��k������0
                k = 0;
            } else {
                System.out.println(start.get(k));
                start.remove(k);
            }
            
        }
        System.out.println("���һ������Ԫ����" + start.get(0));
	}
	public int LastRemaining_Solution(int n, int m) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int index = 0;
        while (list.size() > 1) {
            index = (index + m - 1)%list.size();
            list.remove(index);
        }
        return list.size() == 1 ? list.get(0) : -1;
    }
}
