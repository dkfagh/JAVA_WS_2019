import java.awt.*;
import javax.swing.*;

public class paintComponentEx extends JFrame {
	public paintComponentEx() {
		this.setTitle("¹öÆ°Ä¿½ºÅÒ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		MyButton b1 = new MyButton("Insert");
		b1.setOpaque(true);
		b1.setBackground(Color.GRAY);
		c.add(b1);
		
		MyButton b2 = new MyButton("Select");
		b2.setOpaque(true);
		b2.setBackground(Color.GRAY);
		c.add(b2);
		
		this.setSize(500,500);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new paintComponentEx();
	}
}