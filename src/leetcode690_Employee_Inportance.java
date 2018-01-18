import java.util.ArrayList;
import java.util.List;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月18日 下午2:44:50
* 类说明: 
*/
public class leetcode690_Employee_Inportance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public int getImportance(List<Employee> employees, int id) {
		int sum = 0;
		boolean flag = true;
		List<Integer> list = new ArrayList<>();
		for (Employee e : employees) {
			if (e.id == id){
				for (Integer integer : e.subordinates) {
					list.add(integer);
				}
				sum = sum + e.importance;
				flag = false;
				break;
			}
		}
		if (flag || list.size() == 0){
			return sum;
		}
		else {
			for (Integer integer : list) {
				sum += getImportance(employees, integer);
			}
			return sum;
		}
		 
	 }
	        
}
