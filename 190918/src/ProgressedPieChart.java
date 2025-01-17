import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProgressedPieChart extends JFrame {
	private int [] data = {0,0,0,0};
	private int [] arcAngle = new int [4];
	private Color [] color = {Color.RED, Color.BLUE, Color.MAGENTA, Color.ORANGE};
	private String [] quarter = {"1/4분기", "2/4분기", "3/4분기", "4/4분기"};
	private JTextField[] tf =new JTextField[4];
	private ChartPanel chartpanel = new ChartPanel();
	
	public ProgressedPieChart() {
		this.setTitle("파이 차트 만들기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(new ValuePanel(),BorderLayout.NORTH);
		c.add(chartpanel,BorderLayout.CENTER);
		this.setSize(600, 500);
		this.setVisible(true);
		drawChart();
	}
	private void drawChart() {
		int sum=0;
		for(int i=0; i<data.length; i++) {
			data[i] = Integer.parseInt(tf[i].getText());
			sum+=data[i];			
		}

		if(sum == 0) return;

		for(int i=0; i<data.length; i++) 
			arcAngle[i]=(int)Math.round((double)data[i]/(double)sum*360);
		
		chartpanel.repaint();
	}
	
	private class ValuePanel extends JPanel {
		public ValuePanel() {
			this.setBackground(Color.GRAY);
			for(int i=0 ; i<tf.length ; i++ ) {
				tf[i] = new JTextField("0", 8);
				tf[i].addActionListener(new MyActionListener());
				add(new JLabel(quarter[i]));
				add(tf[i]);
			}
		}
		private class MyActionListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				int n;
				try {
					n = Integer.parseInt(t.getText());
				}catch(Exception ex) {
					t.setText("0");
					return;
				}
				drawChart();
			}
		}
	}
	
	private class ChartPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			int startAngle = 0;
			for(int i=0; i<data.length; i++) {
				g.setColor(color[i]);
				g.drawString(quarter[i]+" "+Math.round(arcAngle[i]*100./360.)+"%", 40+i*150, 30);
			}
			for(int i=0; i<data.length; i++) {
				g.setColor(color[i]);
				g.fillArc(120, 50, 350, 350, startAngle, arcAngle[i]);
				startAngle = startAngle + arcAngle[i];
		}
	}
	}
	public static void main(String[] args) {
		new ProgressedPieChart();
	}
}