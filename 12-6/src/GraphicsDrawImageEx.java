import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawImageEx() {
		setTitle("���� ũ��� ���ϴ� ��ġ�� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(600,700);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/football.png");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
//			g.drawImage(img, 20, 20, this);                                // �̹��� ���
//			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);         // �̹��� ũ�⸦ ��� ũ�⿡ �°�
//			g.drawImage(img, 20, 20, 200, 300, 125, 150, 250, 300, this);  // ���� �̹����� �߶󳻼� ����ũ�⿡
			
			g.setClip(120,180,200,300);                                     // Ŭ����
			g.clipRect(150, 210, 50, 50);                                   // Ŭ���� �� �̹������� ������
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go Gator!!", 130, 360);
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawImageEx();
	}
}