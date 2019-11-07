import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class MenuEx extends JFrame {
	
	private JLabel imgLabel = new JLabel();
	private JLabel label = new JLabel("Hello");
	
	public MenuEx() {
		this.setTitle("Menu 만들기 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		this.add(imgLabel, BorderLayout.CENTER);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Ravie", Font.ITALIC, 30));
		this.add(label, BorderLayout.SOUTH);
		setSize(500,400);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		
		JMenuItem load = new JMenuItem("Load");
		load.addActionListener(new OpenActionListener());
		screenMenu.add(load);
		screenMenu.addSeparator();
		JMenuItem color = new JMenuItem("Color");
		load.addActionListener(new MenuActionListener());
		screenMenu.add(color);
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("Exit"));		
			
		mb.add(screenMenu);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		
		setJMenuBar(mb);
	}
		class OpenActionListener implements ActionListener {
			private JFileChooser chooser;
			
			public OpenActionListener() {
				chooser = new JFileChooser();
			}
			public void actionPerformed(ActionEvent e) {
//				System.out.println("Load");
//				imgLabel.setIcon(new ImageIcon("images/Hydrangeas.jpg"));
				FileNameExtensionFilter filter = new FileNameExtensionFilter("이미지파일", "png", "jpg", "gif");
				chooser.setFileFilter(filter);
				int ret = chooser.showOpenDialog(null);
//				if(ret==JFileChooser.APPROVE_OPTION) {
//					JOptionPane.showMessageDialog(null, "파일을 선택하세요.");
//					return;
//				}
				String filePath = chooser.getSelectedFile().getPath();
				imgLabel.setIcon(new ImageIcon(filePath));
				pack();
			}
		}
		
		class MenuActionListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if(cmd.equals("Color")) {
					Color selectedColor = JColorChooser.showDialog(null, "Color", Color.YELLOW);
					
					if(selectedColor != null)
						label.setForeground(selectedColor);
				}
			}
		}
	
	public static void main(String[] args) {
		new MenuEx();
	}
}