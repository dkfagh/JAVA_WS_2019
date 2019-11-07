import javax.swing.*;
import java.awt.*;

public class PieChart  extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public PieChart() {
		setTitle("Pie Chart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(600, 500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.BLACK);
			g.drawRoundRect(30, 30, 520, 410, 15, 15);       // 테두리
			g.drawString("2018 영업 실적", 250, 20);             // 제목
			g.drawRect(60, 360, 460, 60);                    // 범례
			g.drawString("범례", 270, 380);
			g.drawString("단위 : 억원", 450, 200);              // 단위
			g.drawString("1/4분기", 110, 398);                // 범례 값
			g.drawString("2/4분기", 220, 398);
			g.drawString("3/4분기", 330, 398);
			g.drawString("4/4분기", 440, 398);
			
			g.setColor(Color.RED);                           // 1/4분기
			g.fillArc(100, 50, 300, 300, 0, 58);
			g.fillOval(80, 385, 15, 15);
			g.setColor(Color.GREEN);                         // 2/4분기
			g.fillArc(100, 50, 300, 300, 58, 79);
			g.fillOval(190, 385, 15, 15);
			g.setColor(Color.MAGENTA);                       // 3/4분기
			g.fillArc(100, 50, 300, 300, 137, 97);
			g.fillOval(300, 385, 15, 15);
			g.setColor(Color.BLUE);                          // 4/4분기
			g.fillArc(100, 50, 300, 300, 234, 126);
			g.fillOval(410, 385, 15, 15);			
			
			g.setColor(Color.WHITE);                         // 분기 값
			g.drawString("150", 340, 160);
			g.drawString("200", 235, 110);
			g.drawString("250", 130, 220);
			g.drawString("320", 280, 300);
		}
	}
			
	public static void main(String[] args) {
		new PieChart();
	}
}