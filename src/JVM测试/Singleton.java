package JVM测试;
/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月16日 下午9:43:58
* 类说明: 
*/
public class Singleton {
	private static class SingletonHolder {
		private static Singleton singleton = new Singleton();
		static {
			System.out.println("静态内部类的初始化");
		}
	}
	private Singleton() {
		if (SingletonHolder.singleton != null) {
			System.out.println("静态内部类在外部类加载时就初始化了");
		}
	}
	public static void main(String[] args) {
		Singleton singleton;
	}
}
