import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import java.util.StringTokenizer;

import javax.sound.midi.Receiver;
import javax.swing.*;

public class ChatClient extends JFrame implements ActionListener {
	private BufferedReader in = null;
	private BufferedWriter out = null;
	private Socket socket = null;
	private Receiver receiver = null;
	private JTextField sender = null;
	private JLabel namelb;
	private String clname;
	private JSplitPane split;
	private String svname;
	
	public ChatClient() {
		
		clname = JOptionPane.showInputDialog("이름을 입력하세요.");
		
		setTitle(clname + " 채팅 중");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		receiver = new Receiver();
		receiver.setEditable(false);

		split = new JSplitPane();
		
		namelb = new JLabel(clname);
		
		sender = new JTextField();
		sender.addActionListener(this);
		
		split.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		
		split.setLeftComponent(namelb);
		split.setRightComponent(sender);
		
		c.add(new JScrollPane(receiver), BorderLayout.CENTER);
		//c.add(sender,BorderLayout.SOUTH);
		add(split, BorderLayout.SOUTH);
		
		setSize(400, 200);
		setVisible(true);
		
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());
		}
		
		Thread th = new Thread(receiver);
		th.start();
	}

	private void setupConnection() throws IOException {
		socket = new Socket("localhost", 9999);
		receiver.append("서버에 연결 완료");
		int pos = receiver.getText().length();
		receiver.setCaretPosition(pos);
		
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	}
	
	private static void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}
	
	private class Receiver extends JTextArea implements Runnable {
		public void run() {
			String msg = null;
			while (true) {
				try {
					msg = in.readLine();
					StringTokenizer st = new StringTokenizer(msg, ">");
					svname = st.nextToken();
					msg = st.nextToken();
				} catch(IOException e) {
					handleError(e.getMessage());
				}
				this.append("\n" + svname + " < " + msg);
				int pos = this.getText().length();
				this.setCaretPosition(pos);
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sender) {
			String msg = sender.getText();
			try {
				out.write(clname + ">" + msg + "\n");
				out.flush();
				
				receiver.append("\n" + clname + " > " + msg);
				int pos = receiver.getText().length();
				receiver.setCaretPosition(pos);
				sender.setText(null);
			} catch(IOException e1) {
				handleError(e1.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		new ChatClient();
	}
}