import javax.swing.*;
import java.awt.*;

public class Graph extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public Graph() {
		setTitle("������Ȳ ����׷���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(500, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.BLACK);
			g.drawRoundRect(30, 30, 430, 310, 15, 15);       // �׵θ�
			g.drawLine(100, 210, 100, 310);
			g.drawLine(100, 310, 400, 310);
			g.drawString("2018 ���� ����", 190, 20);             // ����
			int gap = 40;
			g.drawString("1��б�", 45, 60);                   // ����׷��� �ʵ��
			g.drawString("2��б�", 45, 60+gap);
			g.drawString("3��б�", 45, 60+gap*2);
			g.drawString("4��б�", 45, 60+gap*3);
			g.drawString("1��б�", 140, 330);                 // �������׷��� x�� ��
			g.drawString("2��б�", 200, 330);
			g.drawString("3��б�", 260, 330);
			g.drawString("4��б�", 320, 330);
			g.drawString("0", 75, 310);                      // �������׷��� y�� ��
			g.drawString("100", 75, 285);
			g.drawString("200", 75, 255);
			g.drawString("350", 75, 220);
			g.drawString("150", 260, 60);                    // ��
			g.drawString("200", 310, 60+gap);
			g.drawString("250", 360, 60+gap*2);
			g.drawString("320", 430, 60+gap*3);
			
			g.setColor(Color.BLUE);
			int height = 15;
			g.fillRect(100, 48, 150, height);                // ���� �׷���
			g.fillRect(100, 48+gap, 200, height);
			g.fillRect(100, 48+gap*2, 250, height);
			g.fillRect(100, 48+gap*3, 320, height);
			
			g.setColor(Color.WHITE);
			g.drawString("16%", 170, 60);                    // ��
			g.drawString("22%", 190, 60+gap);
			g.drawString("27%", 220, 60+gap*2);
			g.drawString("35%", 260, 60+gap*3);
						
			g.setColor(new Color(189, 88, 190));             // rgb ���� ����
			g.drawLine(160, 267, 220, 253);                  // ������ �׷���
			g.drawLine(220, 253, 280, 239);
			g.drawLine(280, 239, 340, 219);
			
		}
	}

	public static void main(String[] args) {
		new Graph();
	}
}