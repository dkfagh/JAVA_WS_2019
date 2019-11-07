import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;

public class JavaEx extends JFrame {
	private JButton [] icon = new JButton [2];
	private ArrayList<ImageIcon> image = new ArrayList<ImageIcon>();	
	private ImageIcon [] arrow = {
			new ImageIcon("images/left.png"),
			new ImageIcon("images/right.png")};
	private JLabel imageLabel;
	private int i = 0;

	public JavaEx() {
		setTitle("자바연습문제09_5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		File f = new File("C:\\myPhoto");
		File[] subImages = f.listFiles();
		
		for(int j=0 ; j<subImages.length ; j++) {
			ImageIcon fruit = new ImageIcon("C:\\myPhoto\\img"+(j+1)+".png");
			image.add(fruit);}
		
		imageLabel = new JLabel(image.get(i));
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.GRAY);
		
		ButtonGroup g = new ButtonGroup();
		for(int i = 0 ; i < icon.length ; i++) {
			icon[i] = new JButton(arrow[i]);
			g.add(icon[i]);
			buttonPanel.add(icon[i]);
			icon[i].addActionListener(new MyActionListener());
		}

		c.add(imageLabel, BorderLayout.CENTER);
		c.add(buttonPanel, BorderLayout.SOUTH);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	private void createMenu() {
		
		JMenuBar mb = new JMenuBar();
		JMenuItem [] menuItem = new JMenuItem[6];
		String[] itemTitle = {"Apple", "Strawberry", "Grape", "Hide", "ReShow", "Exit"};
		JMenu screenMenu = new JMenu("Menu");
		
		MenuActionListener listener = new MenuActionListener();
		for(int i = 0 ; i <menuItem.length ; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);
		}
		mb.add(screenMenu);
		setJMenuBar(mb);
	}
		
	class MenuActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch(cmd) {
			case "Apple":
				imageLabel.setIcon(image.get(0));
				break;
			case "Strawberry":
				imageLabel.setIcon(image.get(7));
				break;
			case "Grape":
				imageLabel.setIcon(image.get(9));
				break;
			case "Hide" :
				imageLabel.setVisible(false);
				break;
			case "Reshow" :
				imageLabel.setVisible(true);
				break;
			case "Exit" :
				System.exit(0);
			}
		}
	}
	
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==icon[0]){
				i-=1;
				i+=image.size();
				i%=image.size();
				imageLabel.setIcon(image.get(i));
			}
			else if(e.getSource()==icon[1]) {
				i+=1;
				i%=image.size();
				imageLabel.setIcon(image.get(i));
			}
		}
	}
	public static void main(String[] args) {
		new JavaEx();
	}
}