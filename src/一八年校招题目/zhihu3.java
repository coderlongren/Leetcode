package һ����У����Ŀ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��8��25�� ����7:46:49
* ��˵��: 
*/
public class zhihu3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(1);
		Collections.sort(list, (a, b) -> a.compareTo(b));
	}
}
