import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// in this l juss practice the Iterator
		//ʹ�õ����� ����ȥ�������е�Ԫ��
		List<String> list = new  ArrayList<String>();
		list.add("sailong");
		list.add("Tom");
		list.add("Echo");
		Iterator<String> iterator = list.iterator();
		System.out.println("total size of the list is " + list.size());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());//println the current element
			iterator.remove();// remove the current element
			System.out.println("size of the list is :" + list.size());
		}
		
	}

}
