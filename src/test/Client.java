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

public class Client extends Thread {
	private static JTextArea ta_out;// �����
	private static JTextField tf_in;// �����
	private static ServerSocket serverSocket;// serverSocket����
	private static String msg = "";
	private static int lines = 0;

	public Client(int port) throws IOException {
		serverSocket = new ServerSocket(port);
		serverSocket.setSoTimeout(0);// ����ʱ
	}
	
	/*
	 * �������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createGUI();
		try {
			Thread t = new Client(6067);
			t.run(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ���ƿͻ������촰��
	public static void createGUI() {
		// �����ͻ������
		JFrame frame = new JFrame("�ͻ��˽���");
		ta_out = new JTextArea();
		tf_in = new JTextField();
		JButton btn = new JButton("����");
		// ���ô�С��λ��
		ta_out.setBounds(20, 20, 360, 220);
		tf_in.setBounds(20, 260, 280, 30);
		btn.setBounds(320, 260, 60, 30);
		// �����������������
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ta_out.setEditable(false);
		// ����������������ʾ����
		frame.add(ta_out);
		frame.add(tf_in);
		frame.add(btn);
		frame.setSize(416, 340);
		// ��ʾ����
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
		// ���ð�ť�����¼�,���ӷ���˲�������Ϣ
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					if (lines >= 6) {
						msg = "";
						lines = 0;
					}
					Socket client1 = new Socket("localhost", 6066);
					OutputStream outToServer = client1.getOutputStream();
					DataOutputStream out = new DataOutputStream(outToServer);

//					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// �������ڸ�ʽ
//					msg += df.format(new Date()) + "\n" + "��˵��" + tf_in.getText() + "\n";
					msg += "�ͻ���"+client1.getPort() + "������: " + tf_in.getText() + "\n";
					lines += 1;
					out.writeUTF("�˿�" + client1.getPort() + "�������������: " + tf_in.getText());
					ta_out.setText(msg);
					tf_in.setText("");
					client1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}

	// ����˼����ͻ��˷���������Ϣ
	public void run() {
		while (true) {
			try {
				if (lines >= 12) {
					msg = "";
					lines = 0;
				}
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// �������ڸ�ʽ
				Socket server = serverSocket.accept();
				System.out.println(server.getPort());
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
