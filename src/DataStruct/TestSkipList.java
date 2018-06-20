package DataStruct;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月17日 晚上 01:16:14
* 类说明: 
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
