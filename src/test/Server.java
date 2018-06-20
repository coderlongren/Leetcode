package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Server extends Thread {
	private static JTextArea ta_out;// 输出框
	private static JTextField tf_in;// 输入框
	private static ServerSocket serverSocket;// serverSocket对象
	private static String msg = "";
	private static int lines = 0;

	public Server(int port) throws IOException {
		serverSocket = new ServerSocket(port);
		serverSocket.setSoTimeout(0);// 不超时
	}

	/*
	 * 程序入口
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createGUI();
		try {
			Thread t = new Server(6066);
			t.run();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 绘制服务端聊天窗口
	public static void createGUI() {
		// 容器和基本组件
		JFrame frame = new JFrame("服务器");// 容器
		ta_out = new JTextArea();// 输出框
		tf_in = new JTextField();// 输入框
		JButton btn = new JButton("发送");// 发送按钮
		// 设置大小和位置
		ta_out.setBounds(20, 20, 360, 220);
		tf_in.setBounds(20, 260, 280, 30);
		btn.setBounds(320, 260, 60, 30);
		// 设置容器和组件属性
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ta_out.setEditable(false);
		// 组件添加至容器并显示出来
		frame.add(ta_out);
		frame.add(tf_in);
		frame.add(btn);
		frame.setSize(416, 340);
		// 显示窗口
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
		
		// 设置按钮监听事件,连接服务端并发送消息
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					if (lines >= 12) {
						msg = "";
						lines = 0;
					}
					Socket client1 = new Socket("localhost", 6067);
					OutputStream outToServer = client1.getOutputStream();
					DataOutputStream out = new DataOutputStream(outToServer);

					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
					msg +=  "服务器: " + client1.getPort() + "发送:" + tf_in.getText() + "\n";
					lines += 1;
					out.writeUTF("服务器" + client1.getPort() + "回复: " + tf_in.getText());
					ta_out.setText(msg);
					tf_in.setText("");
					client1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}

	// 服务端监听客户端发送过来的消息
	public void run() {
		while (true) {
			try {
				if (lines >= 6) {
					msg = "";
					lines = 0;
				}
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
				Socket server = serverSocket.accept();
				DataInputStream in = new DataInputStream(server.getInputStream());
				msg +=  in.readUTF() + "\n";
				lines += 1;
				ta_out.setText(msg);
				server.close();
			} catch (SocketTimeoutException s) {
				ta_out.setText("Socket timed out!");
				break;
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}
