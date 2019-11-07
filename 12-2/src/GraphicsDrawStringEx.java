import javax.swing.*;
import java.awt.*;

public class GraphicsDrawStringEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawStringEx() {
		setTitle("drawString 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.CYAN);
			g.drawString("자바는 재밌다~~~", 30, 30);       // 문자열 그리기
			g.drawOval(15, 15, 120, 20);               // 원 그리기
			g.setColor(Color.PINK);
			g.drawString("하늘만큼 땅만큼~~~", 60, 60);
			g.drawRoundRect(50, 45, 120, 20, 10, 10);  // 둥근 사각형 그리기
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawStringEx();
	}
}