package 序列化;

import java.io.Serializable;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年1月12日 上午11:51:32
* 类说明: 
*/
public class User implements Serializable{
	private static final long serialVersionUID = 8294180014912103005L;  
	 
    private static String username; // static 不能被序列化的
    private transient  String passwd;
    
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
}
