package ����;
/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��3��3�� ����9:10:19
* ��˵��: 
*/
public class ʵ���� {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;
        // һ�����������ʽ
        class1 = Class.forName("����.TestReflect");
        class2 = new TestReflect0().getClass();
        class3 = TestReflect0.class;
        System.out.println("������   " + class1.getName());
        System.out.println("������   " + class2.getName());
        System.out.println("������   " + class3.getName());
        /**
         *  ������   ����.TestReflect
			������   ����.TestReflect
			������   ����.TestReflect
         */
	}

}
