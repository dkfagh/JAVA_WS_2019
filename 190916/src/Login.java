import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
	public Login() {
		this.setTitle("로그인");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		c.setLayout(null);   //레이아웃 사용 안함
		
		JLabel label_id = new JLabel("ID");
		label_id.setBounds(20, 20, 20, 20);   //x좌표, y좌표, 가로크기, 세로크기 설정
		c.add(label_id);
		
		JTextField textfield_id = new JTextField();
		textfield_id.setBounds(20+20+10, 20, 140, 20);
		c.add(textfield_id);
		
		JLabel label_pw = new JLabel("PW");
		label_pw.setBounds(20, 20+20+10, 20, 20);   //x좌표, y좌표, 가로크기, 세로크기 설정
		c.add(label_pw);
		
		JPasswordField passwordfield_pw = new JPasswordField();
		passwordfield_pw.setBounds(20+20+10, 20+20+10, 140, 20);
		c.add(passwordfield_pw);
		
		JButton login = new JButton("Login");
		login.setBounds(200, 20, 65, 50);
//		login.setBounds(20, 20+20+10+20+10, 80, 20);
		c.add(login);
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Login();
	}
}