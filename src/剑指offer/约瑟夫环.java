package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月6日 下午9:48:35
* 类说明:  第一次参加CCF的时候，也想用linkedList来实现这个来着，可惜当时时间紧张，最后还是强行写了一个双向循环链表
*  最后 一个一个的删除元素，这样的利用原理来实现是最简单简洁的
*/
public class 约瑟夫环 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yuesefu(4, 3);
	}
	public static void yuesefu(int totalNum, int countNum) {
        // 初始化人数
        List<Integer> start = new ArrayList<Integer>();
        for (int i = 1; i <= totalNum; i++) {
            start.add(i);
        }
        // 从第K个开始计数
        int k = 0;
        while (start.size() > 1) {
            k = k + countNum;
            // 第m人的索引位置
            k = k % (start.size()) - 1;// 关键
            // 判断是否到队尾 如果到达了队尾，则得到的k = -1
            if (k < 0) {
                System.out.println(start.get(start.size() - 1));
                start.remove(start.size() - 1);
                // 删掉了队尾元素之后，k重新置0
                k = 0;
            } else {
                System.out.println(start.get(k));
                start.remove(k);
            }
            
        }
        System.out.println("最后一个存活的元素是" + start.get(0));
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
