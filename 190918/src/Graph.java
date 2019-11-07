import javax.swing.*;
import java.awt.*;

public class Graph extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public Graph() {
		setTitle("매출현황 막대그래프");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(500, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.BLACK);
			g.drawRoundRect(30, 30, 430, 310, 15, 15);       // 테두리
			g.drawLine(100, 210, 100, 310);
			g.drawLine(100, 310, 400, 310);
			g.drawString("2018 영업 실적", 190, 20);             // 제목
			int gap = 40;
			g.drawString("1사분기", 45, 60);                   // 막대그래프 필드명
			g.drawString("2사분기", 45, 60+gap);
			g.drawString("3사분기", 45, 60+gap*2);
			g.drawString("4사분기", 45, 60+gap*3);
			g.drawString("1사분기", 140, 330);                 // 꺾은선그래프 x축 값
			g.drawString("2사분기", 200, 330);
			g.drawString("3사분기", 260, 330);
			g.drawString("4사분기", 320, 330);
			g.drawString("0", 75, 310);                      // 꺾은선그래프 y축 값
			g.drawString("100", 75, 285);
			g.drawString("200", 75, 255);
			g.drawString("350", 75, 220);
			g.drawString("150", 260, 60);                    // 값
			g.drawString("200", 310, 60+gap);
			g.drawString("250", 360, 60+gap*2);
			g.drawString("320", 430, 60+gap*3);
			
			g.setColor(Color.BLUE);
			int height = 15;
			g.fillRect(100, 48, 150, height);                // 막대 그래프
			g.fillRect(100, 48+gap, 200, height);
			g.fillRect(100, 48+gap*2, 250, height);
			g.fillRect(100, 48+gap*3, 320, height);
			
			g.setColor(Color.WHITE);
			g.drawString("16%", 170, 60);                    // 값
			g.drawString("22%", 190, 60+gap);
			g.drawString("27%", 220, 60+gap*2);
			g.drawString("35%", 260, 60+gap*3);
						
			g.setColor(new Color(189, 88, 190));             // rgb 색상 설정
			g.drawLine(160, 267, 220, 253);                  // 꺾은선 그래프
			g.drawLine(220, 253, 280, 239);
			g.drawLine(280, 239, 340, 219);
			
		}
	}

	public static void main(String[] args) {
		new Graph();
	}
}