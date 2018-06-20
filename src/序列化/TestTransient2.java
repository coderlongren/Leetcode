package ���л�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��1��12�� ����1:08:49
* ��˵��: 
*/
public class TestTransient2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
			System.out.println("read before Serializable: ");
				User user = new User();
		        user.setUsername("������");
		        user.setPasswd("123456");
		        System.out.println("username: " + user.getUsername());
		        System.err.println("password: " + user.getPasswd());
		        
		        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("E:/Ehcache/user.txt"));
		        os.writeObject(user); // ��user���� ���л�
		        os.flush();
		        os.close();
		        System.out.println("user�����Ѿ����л���");
		        user.setUsername("wangyake"); // ע�� objectIuputStream �ж�ȡ�Ĳ��� ���ſ� ����wangyake
		         // ��Ϊ name����û�б����л�
		        ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:/Ehcache/user.txt"));
		        try {
					user = (User) in.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // �����ж�ȡUser������
		        
		        in.close();

		        System.out.println("\nread after Serializable: ");
		        System.out.println("username: " + user.getUsername());
		        System.err.println("password: " + user.getPasswd());

	}

}
