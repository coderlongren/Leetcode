package ���ű���;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��23�� ����2:09:25
* ��˵��: 
*/
import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {

    private static final String carSplit =";";
    private static final String timeSplit =",";
    private static final String regress = "(\\d{1,2},\\d{1,2};)*\\d{1,2},\\d{1,2}$";
    
    public static void main(String[] args) {
        String inString = null;
        // ��������
        Scanner in = new Scanner(System.in);
        inString = in.nextLine();
        //�ַ��������ʽУ��
        Pattern pat = Pattern.compile(regress);
        if(inString == null || inString.trim().equals("")||!pat.matcher(inString).matches()){
            System.out.println("�������!");
            return;
        }
        Main sol = new Main();
        int countCars = sol.countCars(sol.convertToArray(inString));
        System.out.println(countCars);
    }

    //�����ַ���ת����
    public int[][] convertToArray(String str) {
        String[] strArray = str.split(carSplit);
        int row = strArray.length;
        int col = 2;
        // �ַ�ת�����ж�
        int[][] carArray = new int[row][col];
        int start,end;
        for (int i = 0; i < row; i++) {
            start = Integer.parseInt(strArray[i].split(timeSplit)[0]);
            end = Integer.parseInt(strArray[i].split(timeSplit)[1]);
            if(start>end){
                continue;
            }
            carArray[i][0] = start;
            carArray[i][1] = end;
        }
        return carArray;
    }
    //�����㷨ʵ��
    public int countCars(int[][] carArray) {
        int ans = 1;
        List<Interval> intervals = new ArrayList<>();
        for (int i = 0; i < carArray.length; i++) {
        	intervals.add(new Interval(carArray[i][0], carArray[i][1]));
        }
        Collections.sort(intervals, new Comparator<Interval>() {

			@Override
			public int compare(Interval i1, Interval i2) {
				// TODO Auto-generated method stub
				if (i1.start > i2.start) {
					return 1;
				}
				else if (i1.start < i2.start) {
					return -1;
				}
				else {
					return 0;
				}
			}
        	
		});
        List<Interval> res = new ArrayList<>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        
        Iterator iterator = intervals.iterator();
        int count = 0;
        while (iterator.hasNext()) {
        	Interval temp = (Interval) iterator.next();
        	// ���غ���
//        	System.out.println(temp.start);
        	
        	if (temp.start <= end) {
        		count++;
        		end = Math.max(end, temp.end);
        	}
        	if (temp.end > end) {
        		count--;
        		start = temp.end;
        	}
        	ans = Math.max(ans, count);
        }
        return ans; // ���ؼ�����
    }
}
class Interval {
	int start;
	int end;
	public Interval() {
		start = 0;
		end  = 0;
	}
	public Interval(int s, int e) {
		start = s;
		end = e;
	}
	
}