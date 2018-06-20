package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月20日 下午6:44:29
* 类说明: 
*/
public class TestPrintStream {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String path = "testPrintStream.txt";
		PrintStream printStream = new PrintStream(path);
		try {
			printStream.print("test1 \r\n");
			printStream.print("test2 \r\n");
			printStream.print("test3");
			
			printStream.flush(); // 刷新输出流
			System.out.println("file was writted in " + new File(path).getAbsolutePath());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
