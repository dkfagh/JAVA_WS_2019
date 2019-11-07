import javax.swing.*;
import java.awt.*;

public class paintJPanelEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public paintJPanelEx() {
		setTitle("JPanel의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(250, 220);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);              
			g.drawRect(10, 10, 50, 50);         // 사각형 그리기
			g.setColor(Color.GREEN);
			g.drawRect(50, 50, 50, 50);
			g.setColor(Color.BLUE);
			g.drawRect(90, 90, 50, 50);
			g.setColor(Color.CYAN);
			g.drawLine(10, 10, 140, 140);       // 선 그리기
			g.drawLine(10, 60, 60, 10);
			g.drawLine(50, 100, 100, 50);
			g.drawLine(90, 140, 140, 90);
			g.setColor(Color.BLACK);
			g.fillRect(140, 90, 50, 50);        // 속이 찬 사각형 그리기
		}
	}
	public static void main(String[] args) {
		new paintJPanelEx();
	}
}