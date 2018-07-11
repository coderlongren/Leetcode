package IO;

import java.io.FileInputStream;
import java.io.PushbackInputStream;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月20日 下午6:35:27
* 类说明: 
*/
public class TestPushbackInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String srcFile = "test.txt";

	    try (PushbackInputStream pis = new PushbackInputStream(new FileInputStream(
	        srcFile))) {
	      byte byteData;
	      while ((byteData = (byte) pis.read()) != -1) {
	        System.out.print((char) byteData);
	        pis.unread(byteData);
	        byteData = (byte) pis.read();
	        System.out.print((char) byteData);
	      }
	    } catch (Exception e2) {
	      e2.printStackTrace();
	    }
	}

}
