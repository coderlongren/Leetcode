package ����ͷ��;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��25�� ����2:35:59
* ��˵��: 
*/
public class ���ں��� {
	 public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  int n = scanner.nextInt();
	  int[] arr = new int[8];
	  for (int i = 0; i < n; i++) {
	   int idex = scanner.nextInt();
	   arr[idex] = 1;
	  }
	  int sum = 1;
	  int i = 1;
	  int j = 0;
	  while (i <= 7) {
	   if (arr[i] == 1) {// ͳ�ƺ�������������
	    for (j = i + 1; j <= 7; j++) {
	     if (arr[j] != 0) {
	      sum = sum + 1;
	     } else {
	      arr[i] = sum;// �Ǿͼ�¼i��Ӧ�������������
	      sum = 1;
	      break;
	     }
	     arr[i] = sum;
	    }
	    i = j + 1;
	   } else {
	    i = i + 1;
	   }
	  }
	  int k = 1;
	  List<String> list = new ArrayList<>();
	  while (k <= 7) {
	   if (arr[k] >= 3) {
	    list.add(k + "-" + arr[k]);
	    k = arr[k] + 1;
	   } else if (arr[k] >= 1 && arr[k] < 3) {
	    list.add(String.valueOf(k));
	    k = k + 1;
	   } else if (arr[k] == 0) {
	    k = k + 1;
	   }
	  }
	  for (int l = 0; l < list.size() - 1; l++) {
	   System.out.print(list.get(l) + ",");
	  }
	  System.out.print(list.get(list.size() - 1));
	 }
}
