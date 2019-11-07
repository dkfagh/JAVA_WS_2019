import javax.swing.*;
import java.awt.*;

public class GraphicsDrawLineEx extends JFrame {
	private MyPanel panel = new MyPanel();

	public GraphicsDrawLineEx() {
		setTitle("drawLine ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(200, 170);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);                // ������ ����
			g.drawLine(20, 20, 100, 100);         // ���׸���
			g.setColor(Color.GREEN);
			g.drawArc(20, 20, 80, 80, 130, 190);  // ��ȣ �׸���
			g.setColor(Color.MAGENTA);
			
			int x [] = {100, 80, 100, 120};       // ��ٰ��� �׸���
			int y [] = {20, 60, 100, 60};
			g.drawPolygon(x, y, 4);
			}
		}
	
	public static void main(String [] args) {
		new GraphicsDrawLineEx();
	}
} 