package ���л�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Date;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��1�� ����4:17:57
* ��˵��: 
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
