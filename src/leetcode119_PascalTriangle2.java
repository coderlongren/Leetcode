import java.util.ArrayList;
import java.util.List;

public class leetcode119_PascalTriangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getRow(0));
	}
	 public static List<Integer> getRow(int rowIndex) {

			if (rowIndex == 0){
				List<Integer> row = new ArrayList();
                row.add(1);
                return row;			
            }
			if (rowIndex == 1){
				List<Integer> row = new ArrayList();
                row.add(1);
                row.add(1);
                return row;		
			}
			
			List<List<Integer>> triangle = new ArrayList<List<Integer>>();
			for (int i = 0; i < rowIndex + 1; i++){
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
			
			
			return triangle.get(rowIndex);
	 }
}
