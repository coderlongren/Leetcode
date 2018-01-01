package 序列化;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Date;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月1日 下午4:17:57
* 类说明: 
*/
public class Test2 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream in = new  ObjectInputStream(new FileInputStream("E:\\Ehcache\\object.obj"));
		String string = (String)in.readObject();
		System.out.println(string);
		Date date = (Date)in.readObject();
		System.out.println(date.toString());
	}

}
