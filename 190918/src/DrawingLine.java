import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DrawingLine extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public DrawingLine() {
		this.setTitle("선 그리기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new DrawingLine();
	}
	
	class MyPanel extends JPanel {
		private ArrayList<Point> aStart = new ArrayList<>();
		private ArrayList<Point> aEnd = new ArrayList<>();
		Point startP = null;
		Point endP = null;
		
		public MyPanel() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					startP = e.getPoint();
					aStart.add(startP);
				}
				public void mouseReleased(MouseEvent e) {
					aEnd.add(e.getPoint());
					endP = e.getPoint();
					repaint();
				}
			});
			
			addMouseMotionListener(new MouseMotionListener() {

				@Override
				public void mouseDragged(MouseEvent e) {
					Point dragP = e.getPoint();
					repaint();
				}

				@Override
				public void mouseMoved(MouseEvent e) {}			
				
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.MAGENTA);
			
			for(int i = 0 ; i < aStart.size() ; i++) {
				
				Point s = aStart.get(i);
				Point e = aEnd.get(i);
				
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
	}
}