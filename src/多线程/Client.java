package 多线程;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年5月30日 下午9:55:45
* 类说明: 
*/
public class Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Socket socket =new Socket("169.254.59.150", 9999);
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("sdfsd".getBytes());
		outputStream.flush();
	}

}
