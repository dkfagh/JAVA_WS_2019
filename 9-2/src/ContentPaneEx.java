import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		this.setTitle("ContentPane과 JFrame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));
		
//		this.setBackground(Color.BLACK);    배경색 안바뀜
		this.add(new JButton("OK"));
		this.add(new JButton("Cancle"));
		this.add(new JButton("Ignore"));

		this.setSize(500, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}
}