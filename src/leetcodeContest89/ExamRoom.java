package leetcodeContest89;

import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月17日 上午10:29:32
* 类说明: 
*/
public class ExamRoom {
	int N;
	List<Integer> list = new ArrayList<>();
	
	public ExamRoom(int N) {
		this.N = N;
    }
	//  1. find the biggest distance at the start, at the end and in the middle.
	//  2. insert index of seat
	//  3. return index
    public int seat() {
    	
    	if (list.size() == 0) {
    		list.add(0);
    		return 0;
    	}
        // 奇数座位
		return N;
    }
    
    public void leave(int p) {
        
    }
}
