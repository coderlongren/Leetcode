package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* @author ���� : coderlong
* @version ����ʱ�䣺2018��6��20�� ����7:45:32
* ��˵��: 
*/
public class TestSystem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char q = 'q';
//		while ((q = (char)System.in.read()) != 'a') {
//			System.out.println("������һ���ַ�");
//			System.out.println(q);
//		}
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		System.out.println("���룬�� ����");
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
