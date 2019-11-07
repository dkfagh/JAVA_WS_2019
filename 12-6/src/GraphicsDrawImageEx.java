import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawImageEx() {
		setTitle("원본 크기로 원하는 위치에 이미지 그리기");
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
			
//			g.drawImage(img, 20, 20, this);                                // 이미지 출력
//			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);         // 이미지 크기를 페널 크기에 맞게
//			g.drawImage(img, 20, 20, 200, 300, 125, 150, 250, 300, this);  // 원본 이미지를 잘라내서 설정크기에
			
			g.setClip(120,180,200,300);                                     // 클리핑
			g.clipRect(150, 210, 50, 50);                                   // 클리핑 된 이미지와의 교집합
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