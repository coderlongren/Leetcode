

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class socket {

	public static void main(String[] args) {
		System.out.println("aaa");
		try {
			ServerSocket server = new ServerSocket(2000);
			System.out.println("server is running.....");
			while (true){
				Socket client = server.accept();
				System.out.println("connected....." + client.getRemoteSocketAddress());
//				client.close();
				// 
				// open 
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(null));
				BufferedReader line = null;
//				while (line = bufferedReader){
//					
//				}
				PrintStream ps = new PrintStream(client.getOutputStream());
				ps.println("welcome to my Server.....");
				client.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
