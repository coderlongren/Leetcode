package leetcodeContest84;

import javax.swing.text.Position;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月20日 下午1:57:47
* 类说明:  错误的答案  不写了。
*/ 
public class leetcode838_Push_Dominoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dominoes = ".L.R...LR..L..";
		System.out.println(pushDominoes(dominoes));
	}
	// 多米诺骨牌的 推导
	// 题意说明了，L 不会影响他周围的L， R不会影响他周围的R
	public static String pushDominoes(String dominoes) {
		if (dominoes == null || dominoes.length() <= 1) {
			return dominoes;
		}
		int len = dominoes.length();
		int[] left = new int[len];
		int[] right = new int[len];
		int pos = -len;
		// 先找出 每个 . 和L的最短距离
		for (int i = 0; i < len; i++) {
			if (dominoes.charAt(i) == 'L') {
				pos = i;
			}
			if (dominoes.charAt(i) == '.') {
				left[i] = i - pos;
			}
		}
		for (int i = len - 1; i >= 0; i--) {
			if (dominoes.charAt(i) == 'L') {
				pos = i;
			}
			if (dominoes.charAt(i) == '.') {
				left[i] = Math.min(left[i], Math.abs(i - pos));
			}
		}
		pos = -len;
		for (int i = 0; i < len; i++) {
			if (dominoes.charAt(i) == 'R') {
				pos = i;
			}
			if (dominoes.charAt(i) == '.') {
				right[i] = i - pos;
			}
		}
		for (int i = len - 1; i >= 0; i--) {
			if (dominoes.charAt(i) == 'R') {
				pos = i;
			}
			if (dominoes.charAt(i) == '.') {
				right[i] = Math.min(right[i], Math.abs(i - pos));
			}
		}
		StringBuilder builder = new StringBuilder();
		char dicL = ' ';
		char dicR = ' ';
		for (int i = 0; i < dominoes.length(); i++) {
			if (dominoes.charAt(i) != '.') {
				builder.append(dominoes.charAt(i));
			}
			else {
				if ((i + left[i]) < len && dominoes.charAt(i + left[i]) == 'L') {
					dicL = 'l';
				}
				else {
					dicL = ' ';
				}
				
				if ((i - right[i]) >= 0 && dominoes.charAt(i - right[i]) == 'R') {
					dicR = 'r';
				}
				else {
					dicR = ' ';
				}
				
				if (dicL == 'l' && dicR == 'r') {
					if (left[i] < right[i]) {
						builder.append("L");
					}
					else if (left[i] > right[i]) {
						builder.append("R");
					}
					else {
						builder.append(".");
					}
				}
				else if (dicL == 'l' && dicR == ' ') {
					builder.append("L");
				}
				else if (dicR == 'r' && dicL == ' ') {
					builder.append("R");
				}
				else {
					builder.append(".");
				}
				
				
			}
		}
		return builder.toString();
	}

}
