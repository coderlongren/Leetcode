package ���л�;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��20�� ����7:16:51
* ��˵��: 
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
