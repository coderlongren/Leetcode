package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import test.test;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��20�� ����7:23:19
* ��˵��: 
*/
public class TestCharder {

	public static void main(String[] args) throws Exception {
		String path = "dummy.txt";
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path)));
		String txt = null;
		
		while ((txt = bufferedReader.readLine()) != null) {
			System.out.println(txt);
		}
		
		
		bufferedReader.close();
	}

}
