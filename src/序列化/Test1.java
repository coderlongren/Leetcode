package ���л�;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��1�� ����4:15:06
* ��˵��: 
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
