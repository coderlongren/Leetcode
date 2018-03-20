package JVM测试;

import java.io.IOException;
import java.io.InputStream;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年3月16日 下午8:59:15
* 类说明: 
*/
public class ClassLoaderTest {
	private String name;
	public ClassLoaderTest(String name) {
		// TODO Auto-generated constructor stub
		name = name;
	}
	public static void main(String[] args) {
		ClassLoader myLoader = new ClassLoader() {
			@Override
			public Class<?> loadClass(String name) throws ClassNotFoundException {
				try {
					String filename = name.substring(name.lastIndexOf(".") + 1) + ".class";
					InputStream is = getClass().getResourceAsStream(filename);
					byte[] bs = new byte[is.available()];
					is.read(bs);
					return defineClass(name, bs, 0, bs.length);
				} catch (ClassFormatError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			}
		};
		
		System.out.println("abcd".lastIndexOf("d"));
		System.out.println("abcd".substring(0, 4));
		
	}
	
	public static void test() {
		ClassLoaderTest test = new ClassLoaderTest("sdsdfsdf");
		System.out.println(test.toString());
	}
}
