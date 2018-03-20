import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月16日 下午2:05:03
* 类说明 :  融合相同的音频 
*/
public class leetcode056_merge_intervals {
	public static List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1) {
        	return intervals;
        }
//        for (Interval interval : intervals) {
//        	System.out.println(interval.start);
//        }
        // 第一部的排序 是非常重要的
        
        // 第一种 lamda表达式 排序，学习了
        // sort by ascending starting point using anonymous comparator
//        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        
        // 一般的思维就是 传入compator比较器啦
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
//        for (Interval interval : intervals) {
//        	System.out.println(interval.start);
//        }
        
        List<Interval> res = new ArrayList<>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        
        Iterator iterator = intervals.iterator();
        
        while (iterator.hasNext()) {
        	Interval temp = (Interval) iterator.next();
        	// 有重合了
//        	System.out.println(temp.start);
        	if (temp.start <= end) {
        		end = Math.max(end, temp.end);
        	}
        	else {
        		res.add(new Interval(start,end));
        		start = temp.start;
        		end = temp.end;
        	}
        }
        res.add(new Interval(start, end));
		return new ArrayList<>(res);
        
    }
	public static void main(String[] args) {
		List<Interval> list = new ArrayList<>();
		Interval i1 = new Interval(1,3);
		Interval i2 = new Interval(2,6);
		Interval i3 = new Interval(8,10);
		Interval i4 = new Interval(15,18);
		list.add(i2);
		list.add(i1);
		list.add(i3);
		list.add(i4);
		System.out.println(merge(list));
	}
}
