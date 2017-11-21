package leetcodeContest59;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.TreeMap;

public class MyCalendar {

	TreeMap<Integer, Integer> calendar;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public MyCalendar(){
		calendar = new TreeMap<Integer, Integer>();
	}
	public boolean book(int start,int end){

		int[] array = {1,2,3,4};
		
		// floorKey ����С�ڵ��ڸ���key������key ��������ڷ���null 
		Integer floorKey = calendar.floorKey(start);
		if (floorKey != null && calendar.get(floorKey) > start){
			return false;
		}
		
		// ceilingKey ���ش��ڵ��ڸ��� key����Сֵ ��������ڷ���null 
		Integer ceilingKey = calendar.ceilingKey(end);
		if(ceilingKey != null && ceilingKey < end){
			return false;
		}
		calendar.put(start, end);
		return true;
	}
}
