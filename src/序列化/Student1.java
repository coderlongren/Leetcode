package 序列化;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月20日 下午7:16:51
* 类说明: 
*/
public class Student1 implements Externalizable{
	private String name = "yake";
	public Student1() {
		
	}
	public Student1(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name:" + this.name;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
			out.writeObject(this.name);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.name = (String)in.readObject();
	}
	
}
