import java.util.ArrayList;
import java.util.List;

public class leetcode_119_pacalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getRow(4));
		List<Integer> test = new ArrayList<Integer>();
		test.add(1);
		test.add(2);
		test.set(0, 2);
		System.out.println(test);
	}
	public static List<Integer> getRow(int rowIndex) {
		
		List<Integer> res = new ArrayList<Integer>();
		for(int i = 0;i<rowIndex+1;i++) {
    		res.add(1);
    		for(int j=i-1;j>0;j--) {
    			res.set(j, res.get(j-1)+res.get(j));
    		}
		}
		return res;
	}
}
