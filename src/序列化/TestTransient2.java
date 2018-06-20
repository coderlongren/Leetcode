package 序列化;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月12日 下午1:08:49
* 类说明: 
*/
public class TestTransient2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
			System.out.println("read before Serializable: ");
				User user = new User();
		        user.setUsername("王雅珂");
		        user.setPasswd("123456");
		        System.out.println("username: " + user.getUsername());
		        System.err.println("password: " + user.getPasswd());
		        
		        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("E:/Ehcache/user.txt"));
		        os.writeObject(user); // 把user对象 序列化
		        os.flush();
		        os.close();
		        System.out.println("user对象已经序列化了");
		        user.setUsername("wangyake"); // 注意 objectIuputStream 中读取的不是 王雅柯 而是wangyake
		         // 因为 name根本没有被序列化
		        ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:/Ehcache/user.txt"));
		        try {
					user = (User) in.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // 从流中读取User的数据
		        
		        in.close();

		        System.out.println("\nread after Serializable: ");
		        System.out.println("username: " + user.getUsername());
		        System.err.println("password: " + user.getPasswd());

	}

}
