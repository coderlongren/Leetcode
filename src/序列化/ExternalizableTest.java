package 序列化;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.util.jar.Attributes.Name;

import org.junit.experimental.theories.Theories;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月12日 下午1:26:25
* 类说明: 
*/
public class ExternalizableTest implements Externalizable {
	private transient String Name = "是的，我也将会被序列化";
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(Name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Name = (String)in.readObject();
	}
	
	
	 public static void main(String[] args) throws Exception {
		 ExternalizableTest ex = new ExternalizableTest();
		 ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("E:/Ehcache/user.txt"));
		 out.writeObject(ex);
		 out.flush();
		 out.close();
		 
		 ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:/Ehcache/user.txt"));
		 ex = (ExternalizableTest) in.readObject();
	     System.out.println(ex.Name);
	     in.close();
		 
		 
	 }

}
