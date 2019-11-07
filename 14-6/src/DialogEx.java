import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyDialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton okButton = new JButton("OK");
	
	public MyDialog(JFrame frame, String title) {
		super(frame, title, true);
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(true);
			}
		});
	}
}

public class DialogEx extends JFrame {
	private MyDialog dialog;
	
	public DialogEx() {
		super("dialogEx ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		JButton btn = new JButton("Show Dialog");
		
		dialog = new MyDialog(this, "Test Dialog");
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		
		JButton btnDelete = new JButton("����");
		btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?", "����", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
					System.out.println("����!");
				
				JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.", "�����Ϸ�", JOptionPane.ERROR_MESSAGE);
			}
			
		});
		
		this.add(btnDelete);
		
		getContentPane().add(btn);
		setSize(250, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new DialogEx();
	}
}