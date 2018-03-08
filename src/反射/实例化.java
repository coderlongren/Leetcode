package 反射;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月3日 下午9:10:19
* 类说明: 
*/
public class 实例化 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class<?> class1 = null;
        Class<?> class2 = null;
        Class<?> class3 = null;
        // 一般采用这种形式
        class1 = Class.forName("反射.TestReflect");
        class2 = new TestReflect0().getClass();
        class3 = TestReflect0.class;
        System.out.println("类名称   " + class1.getName());
        System.out.println("类名称   " + class2.getName());
        System.out.println("类名称   " + class3.getName());
        /**
         *  类名称   反射.TestReflect
			类名称   反射.TestReflect
			类名称   反射.TestReflect
         */
	}

}
