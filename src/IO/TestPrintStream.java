package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��20�� ����6:44:29
* ��˵��: 
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
			
			printStream.flush(); // ˢ�������
			System.out.println("file was writted in " + new File(path).getAbsolutePath());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
