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
		
		// floorKey 返回小于等于给定key的最大的key 如果不存在返回null 
		Integer floorKey = calendar.floorKey(start);
		if (floorKey != null && calendar.get(floorKey) > start){
			return false;
		}
		
		// ceilingKey 返回大于等于给定 key的最小值 如果不存在返回null 
		Integer ceilingKey = calendar.ceilingKey(end);
		if(ceilingKey != null && ceilingKey < end){
			return false;
		}
		calendar.put(start, end);
		return true;
	}
}
