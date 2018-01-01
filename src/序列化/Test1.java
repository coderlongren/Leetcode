package 序列化;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月1日 下午4:15:06
* 类说明: 
*/
public class Test1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("E:\\Ehcache\\object.obj"));
		outputStream.writeObject("Hello");
		outputStream.writeObject(new Date());
		outputStream.close();
	}

}
