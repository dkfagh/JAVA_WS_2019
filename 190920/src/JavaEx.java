import java.awt.*;
import javax.swing.*;
import java.util.Calendar;

class TimerThread extends Thread {
	public static String dateString(Calendar cal) {
		StringBuffer sb = new StringBuffer();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		String smonth = String.format("%02d", month);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		String ssecond = String.format("%02d", second);
		sb.append(year+"-"+smonth+"-"+day+" "+hourOfDay+":"+minute+":"+ssecond);
		return sb.toString();
	}
	private JLabel timerLabel; 
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel; 
	}

	@Override
	public void run() {
		while(true) {
			Calendar now = Calendar.getInstance();
			timerLabel.setText(dateString(now));
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}

public class JavaEx extends JFrame {
	public JavaEx() {
		setTitle("현재 시간");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 30));
		c.add(timerLabel);
		
		TimerThread th = new TimerThread(timerLabel);

		setSize(320,100);
		setVisible(true);
		
		th.start();
	}
	
	public static void main(String[] args) {
		new JavaEx();
	}
}