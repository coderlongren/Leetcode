package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月20日 下午4:55:03
* 类说明: 
*/
public class FileTest1 {

	public static void main(String[] args) throws IOException {
		String path = "dummy.txt";
		InputStream in = new FileInputStream(new File(path));
		byte[] bytes = new byte[2];
		in.read(bytes);
		System.out.println(new String(bytes));
	    File dummyFile = new File(path);
	    boolean fileExists = dummyFile.exists();
	    if (fileExists) {
	    	System.out.println("The dummy.txt  file exists.");
	      
	    } else {
	    	
	      System.out.println("The dummy.txt  file does  not  exist.");
	      
	    }
	    printFilePath(path);
	}
	public  static void printFilePath(String path) {
		File f = new File(path);
		System.out.println("File  Name: " + f.getName());
	    System.out.println("File  exists: " + f.exists());
	    System.out.println("Absolute Path: " + f.getAbsolutePath());
	    
	    try {
	      System.out.println("Canonical Path: " + f.getCanonicalPath());
	    }

	    catch (IOException e) {
	      e.printStackTrace();
	    }
	}

}
