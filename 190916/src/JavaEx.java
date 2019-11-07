import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class JavaEx extends JFrame implements ActionListener {
	public static JLabel la = new JLabel();
	public static Calendar now = Calendar.getInstance();
	
	public static String dateString(Calendar cal) {
		StringBuffer sb = new StringBuffer();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		sb.append(year+"."+month +"."+day+" "+hourOfDay+":"+minute+":"+second);
		return sb.toString();
	}
	
	public JavaEx() {
		
		this.setTitle("자바연습문제07_2");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		c.setLayout(null);   //레이아웃 사용 안함
		
		la.setBounds(100, 30, 200, 70);   //x좌표, y좌표, 가로크기, 세로크기 설정
		c.add(la);
		
		JButton bt1 = new JButton("버튼 1");
		bt1.setBounds(15, 110, 75, 40);
		bt1.addActionListener(new MyActionListener1());
		c.add(bt1);
		
		JButton bt2 = new JButton("버튼 2");
		bt2.setBounds(15+75+20, 110, 75, 40);
		bt2.addActionListener(new MyActionListener2());
		c.add(bt2);
		
		JButton bt3 = new JButton("버튼 3");
		bt3.setBounds(15+(75+20)*2, 110, 75, 40);
		c.add(bt3);
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton bt3 = (JButton)e.getSource();
				la.setText("익명 클래스 / "+dateString(now));
			}
		});
		
		JButton bt4 = new JButton("버튼 4");
		bt4.setBounds(15+(75+20)*3, 110, 75, 40);
		c.add(bt4);
		bt4.addActionListener(this);
		
		this.setSize(400, 200);
		this.setVisible(true);
	}
	
	private class MyActionListener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton bt2 = (JButton)e.getSource();
			la.setText("내부 클래스 / "+dateString(now));
		}
	}
	
	public static void main(String[] args) {
				new JavaEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bt4 = (JButton)e.getSource();
		la.setText("직접 상속 / "+dateString(now));
	}
}

class MyActionListener1 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		Calendar now = Calendar.getInstance();
		JButton bt1 = (JButton)e.getSource();
		JavaEx.la.setText("외부 클래스 / "+JavaEx.dateString(now));
	}
}