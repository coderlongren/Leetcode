package DataStruct;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��17�� ���� 01:16:14
* ��˵��: 
*/
public class TestSkipList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SkipList<String> list=new SkipList<String>();
        System.out.println(list);
        list.put(1, "coderlong");
        list.put(2, "yake");
        list.put(3, "sbsb");
        list.put(1, "new coderlong");
        System.out.println(list);
        System.out.println(list.size());
	}
}
