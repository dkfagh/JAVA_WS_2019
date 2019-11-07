import java.awt.*;
import javax.swing.*;

public class RadioButtonEx extends JFrame {
	public RadioButtonEx() {
		setTitle("라디오버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
		ImageIcon selectedcherryIcon = new ImageIcon("images/selectedcherry.jpg");

		ButtonGroup g = new ButtonGroup();
		
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton peer = new JRadioButton("배");
		JRadioButton cherry = new JRadioButton("체리", cherryIcon);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedcherryIcon);
		
		g.add(apple);
		g.add(peer);
		g.add(cherry);
		
		c.add(apple);
		c.add(peer);
		c.add(cherry);
		
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RadioButtonEx();
	}
}