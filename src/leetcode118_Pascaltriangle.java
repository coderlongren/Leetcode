import java.util.ArrayList;
import java.util.List;

public class leetcode118_Pascaltriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> res = new ArrayList<Integer>();
		System.out.println(generate(5));
		
		
	}
	public static List<List<Integer>> generate(int numRows) {
		
		if (numRows == 0){
			return new ArrayList<List<Integer>>();
		}
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		for (int i = 0; i < numRows; i++){
			List<Integer> row = new ArrayList<Integer>();
			for (int j = 0;j < i + 1; j++){
				if (j == 0 || j == i){
					row.add(1);
				}
				else{
					row.add(triangle.get( i - 1).get(j) + triangle.get(i - 1).get(j - 1));
				}
				
			}
			triangle.add(row);
			
		}
		
		
		return triangle;
    }

}
