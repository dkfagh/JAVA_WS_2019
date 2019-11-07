import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlyingTextEx extends JFrame {
//	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("Hello");
	
	public FlyingTextEx() {
		setTitle("상,하,좌,우, 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
//		c.setLayout(null);
//		c.addKeyListener(new MyKeyListener());
//		la.setLocation(50, 50);
//		la.setSize(100, 20);
		MyKeyListener listener = new MyKeyListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		c.add(la);
		
		setSize(300, 300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
	}
	class MyKeyListener extends KeyAdapter implements MouseListener, MouseMotionListener{
//		public void keyPressed(KeyEvent e) {
//			int keyCode = e.getKeyCode();
//			
//			switch (keyCode) {
//			case KeyEvent.VK_UP:
//				la.setLocation(la.getX(), la.getY()-FLYING_UNIT); break;
//			case KeyEvent.VK_DOWN:
//				la.setLocation(la.getX(), la.getY()+FLYING_UNIT); break;
//			case KeyEvent.VK_LEFT:
//				la.setLocation(la.getX()-FLYING_UNIT, la.getY()); break;
//			case KeyEvent.VK_RIGHT:
//				la.setLocation(la.getX()+FLYING_UNIT, la.getY()); break;
//			}
//		}

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("mouseDragged ("+e.getX()+","+e.getY()+")");
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("mouseMoved ("+e.getX()+","+e.getY()+")");
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {}

		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed ("+e.getX()+","+e.getY()+")");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("mouseReleased ("+e.getX()+","+e.getY()+")");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
	}
	public static void main(String[] args) {
		new FlyingTextEx();
	}

}
