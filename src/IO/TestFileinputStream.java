package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.xml.transform.Templates;

import org.junit.Test;

import 链家.test2;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年4月11日 下午7:59:03
* 类说明: 
*/
public class TestFileinputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dataSourceFile = "asdf.txt";
	    try (FileInputStream fin = new FileInputStream(dataSourceFile)) {

	      byte byteData;
	      while ((byteData = (byte) fin.read()) != -1) {
	        System.out.print((char) byteData);
	      }
	    } catch (FileNotFoundException e) {
	      ;
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}
	@Test
	public void test2() throws Exception {
		File file = new File("E:/Ehcache/test.txt");
		FileReader reader = new FileReader(file);
//		FileWriter writer = new FileWriter(file);
//		writer.write("abc\nabcsdfsdf");
//		writer.flush();
//		writer.close();
		int temp;
		while ((temp = reader.read()) != -1) {
			System.out.print((char)temp);
		}
		
	}
	@Test
	public void copyFile()  throws Exception{
		File file1 = new File("E:/Ehcache/test.txt");
		FileInputStream in = new FileInputStream(file1);
		File file2 = new File("E:/Ehcache/test2.txt");
		FileOutputStream out = new FileOutputStream(file2);
		BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
		String  string;
		while ((string = reader.readLine()) != null) {
			writer.write(string);
		}
		writer.newLine();
		writer.write("这是新增的一行");
		writer.flush();
		reader.close();
		writer.close();
		
		
		
	}
	
	

}
