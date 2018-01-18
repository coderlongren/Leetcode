import java.util.ArrayList;
import java.util.List;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��18�� ����2:44:50
* ��˵��: 
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
