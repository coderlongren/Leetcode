package 反射;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月4日 下午9:53:19
* 类说明: 
*/
public class RealSubject implements Subject {

	@Override
	public String say(String name, int age) {
		// TODO Auto-generated method stub
		return name + "  " + age;
	}

}
