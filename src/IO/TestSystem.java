package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* @author 作者 : coderlong
* @version 创建时间：2018年6月20日 下午7:45:32
* 类说明: 
*/
public class TestSystem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char q = 'q';
//		while ((q = (char)System.in.read()) != 'a') {
//			System.out.println("请输入一个字符");
//			System.out.println(q);
//		}
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		System.out.println("输入，空 结束");
		while (true) {
			line = reader.readLine();
			if (!line.equals("exit")) {
				System.out.println(line);
			}
			else {
				break;
			}

		}
	}

}
