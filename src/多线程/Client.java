package ���߳�;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��5��30�� ����9:55:45
* ��˵��: 
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
