package 注解;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月1日 下午10:36:51
* 类说明: 
*/
public class TestInterface {
	public @interface MethodInfo {
		String author() default "coderlong";
	    String date();
	    int version() default 1;
	}
	
	@MethodInfo(date = "test")
	public void test() {
		System.out.println("注解生效了吗");
	}
}	
