import java.awt.*;
import javax.swing.*;

public class CheckBoxEx extends JFrame {
	public CheckBoxEx() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedcherryIcon = new ImageIcon("images/selectedcherry.jpg");

		JCheckBox apple = new JCheckBox("사과");
		JCheckBox peer = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리", cherryIcon);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedcherryIcon);
		
		c.add(apple);
		c.add(peer);
		c.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBoxEx();
	}
}