import java.awt.*;
import javax.swing.*;

public class MyButton extends JButton {
	public MyButton(String s) {
		super(s);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawRect(1, 1, getWidth()-3, getHeight()-3);
	}
}