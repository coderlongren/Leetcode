package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import test.test;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月20日 下午7:23:19
* 类说明: 
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
