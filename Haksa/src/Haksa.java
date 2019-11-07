import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Haksa extends JFrame {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	private String [] data = {"�й�", "�̸�", "�а�", "�ּ�"};
	private String [] comp = {"���", "���", "����", "����"};
	private JTextField [] tf = new JTextField [4];
	private JButton [] btn = new JButton [4];
	private JButton btnSearch = new JButton("�˻�");
//	JTextArea taList = null;
	DefaultTableModel model = null;
	JTable table = null;
	String query;
	
	public void showList() {		
		try{
			rs = stmt.executeQuery("select * from student2");
		     
		     model.setNumRows(0);
				
				while(rs.next()) {
					String[] row = new String[4];
					row[0] = rs.getString("id");
					row[1] = rs.getString("name");
					row[2] = rs.getString("dept");
					row[3] = rs.getString("address");
					model.addRow(row);
				}
		     rs.close();
		    
		    }
		    catch(Exception e1){
		     //e.getStackTrace();
		     System.out.println(e1.getMessage());
		    }
	}
	
	public Haksa() {
		
		//DB����
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:myoracle", "ora_user", "hong");
			stmt = conn.createStatement();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		this.setTitle("�л����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.addWindowListener(new WindowListener() {
			@Override	public void windowOpened(WindowEvent e) {}
			
			@Override	public void windowClosing(WindowEvent e) {
				try {
					if(conn!=null) {conn.close();}
					if(stmt!=null) {stmt.close();}
					if(rs!=null) {rs.close();}
				}catch(Exception ex) {
					ex.printStackTrace();}
			}
			
			@Override	public void windowClosed(WindowEvent e) {}
			@Override	public void windowIconified(WindowEvent e) {}
			@Override	public void windowDeiconified(WindowEvent e) {}
			@Override	public void windowActivated(WindowEvent e) {}
			@Override	public void windowDeactivated(WindowEvent e) {}
		});
		
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		for(int i=0; i<tf.length; i++) {
			if(i==0) {
				tf[i] = new JTextField("", 14);
				c.add(new JLabel(data[i]+"(*)"));
				c.add(tf[i]);
				c.add(btnSearch);
			}
			else{
				tf[i] = new JTextField("", 20);
				c.add(new JLabel(data[i]+"(*)"));
				c.add(tf[i]);
			}
		}
		
		String colName[]={"�й�","�̸�","�а�","�ּ�"};   //ǥ�� ����� �÷���
		  model=new DefaultTableModel(colName,0);   //ǥ�� ������
		  table = new JTable(model);   //���̺� ��(������) ���ε�
		  table.setPreferredScrollableViewportSize(new Dimension(270,270));   //���̺� ������
		  c.add(new JScrollPane(table));
		  

		  table.addMouseListener(new MouseListener() {   //���콺�� ������ ���� �� �ؽ�Ʈ�ʵ忡 ���õ� �ο��� ������ ���
			@Override
			public void mouseClicked(MouseEvent e) {
				table = (JTable)e.getComponent();
				model = (DefaultTableModel)table.getModel();
				String id = (String)model.getValueAt(table.getSelectedRow(), 0);   //id
				String name = (String)model.getValueAt(table.getSelectedRow(), 1);   //name
				String dept = (String)model.getValueAt(table.getSelectedRow(), 2);   //dept
				String address = (String)model.getValueAt(table.getSelectedRow(), 3);   //address
				
				tf[0].setText(id);
				tf[1].setText(name);
				tf[2].setText(dept);
				tf[3].setText(address);
			}

			@Override	public void mousePressed(MouseEvent e) {}
			@Override	public void mouseReleased(MouseEvent e) {}
			@Override	public void mouseEntered(MouseEvent e) {}
			@Override	public void mouseExited(MouseEvent e) {}
		});
		
//		taList = new JTextArea(17, 25);
//		JScrollPane sp = new JScrollPane(taList);
//		c.add(sp);                                 //JTextArea�� ����� JScrollPane�� �־ add
		
		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(comp[i]);
			c.add(btn[i]);
		}
		
		
		btnSearch.addActionListener(new ActionListener() {   //�˻� ��ư

			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					rs = stmt.executeQuery("select * from student2 where id = '"+tf[0].getText()+"'");
					
//					taList.setText("");   //�ʱ�ȭ -> ��� ��ư�� �θ��� �ߺ� ��� ����
//					
//					taList.append("======================================\n");
//					taList.append(" �й�	�̸�	�а�	�ּ�\n");
//					taList.append("======================================\n");
					
					model.setNumRows(0);
					
					while(rs.next()) {
						String[] row = new String[4];
						row[0] = rs.getString("id");
						row[1] = rs.getString("name");
						row[2] = rs.getString("dept");
						row[3] = rs.getString("address");
						model.addRow(row);
						
						tf[1].setText(rs.getString("name"));
						tf[2].setText(rs.getString("dept"));
						tf[3].setText(rs.getString("address"));
					}
					
				} catch(Exception ex) {
					ex.printStackTrace();
				}

			}
		});
		
		
		btn[0].addActionListener(new ActionListener() {   //��� ��ư

			@Override
			public void actionPerformed(ActionEvent e) {
				try {					
					rs = stmt.executeQuery("select * from student2");
					
					for(int i = 0 ; i < tf.length ; i++) {
						StringTokenizer [] st = new StringTokenizer[4];
						int [] n = new int[4];
						st[i] = new StringTokenizer(tf[i].getText(), " ");
						n[i] = st[i].countTokens();
						if (n[i]==0) {
							JOptionPane.showMessageDialog(null, "(*)�׸��� �ʼ� �Է»����Դϴ�.", "Error", JOptionPane.ERROR_MESSAGE);
							break;
							}
						else if(i == tf.length-1){
							stmt.executeUpdate("insert into student2 (id, name, dept, address) values('"+tf[0].getText()+"', '"+tf[1].getText()+"', '"+tf[2].getText()+"', '"+tf[3].getText()+"')");
							JOptionPane.showMessageDialog(null, "��ϵǾ����ϴ�.");
							for(int j = 0 ; j < tf.length ; j++)
								tf[j].setText("");
						}
					}
						showList();
					
					}catch(Exception ex) {
						ex.printStackTrace();
					}

				
//				for(int i = 0 ; i < tf.length ; i++) {
//						if (tf[i].getText().equals("")) {
//							JOptionPane.showMessageDialog(null, "(*)�׸��� �ʼ� �Է»����Դϴ�.", "Error", JOptionPane.ERROR_MESSAGE);
//							break;
//							}
//				}
//				
//				if (!(tf[0].getText().equals("")) && !(tf[1].getText().equals("")) && !(tf[2].getText().equals("")) && !(tf[3].getText().equals(""))) {
//					taList.append(tf[0].getText()+"\t"+tf[1].getText()+"\t"+tf[2].getText()+"\t"+tf[3].getText()+"\n");
//					
//					for(int j = 0 ; j < tf.length ; j++) {
//					tf[j].setText("");
//					}
//				}
			}
		});
		
		
		btn[1].addActionListener(new ActionListener() {   //��� ��ư

			@Override
			public void actionPerformed(ActionEvent e) {				
				try {					
					rs = stmt.executeQuery("select * from student2");
					
//					taList.setText("");   //�ʱ�ȭ -> ��� ��ư�� �θ��� �ߺ� ��� ����
//					
//					taList.append("======================================\n");
//					taList.append(" �й�	�̸�	�а�	�ּ�\n");
//					taList.append("======================================\n");
//					
//					while(rs.next()) {
//						taList.append(rs.getString("id") + "\t");
//						taList.append(rs.getString("name") + "\t");
//						taList.append(rs.getString("dept") + "\n");
					
					
					//��� �ʱ�ȭ
					model.setNumRows(0);
					
					while(rs.next()) {
						String[] row = new String[4];
						row[0] = rs.getString("id");
						row[1] = rs.getString("name");
						row[2] = rs.getString("dept");
						row[3] = rs.getString("address");
						model.addRow(row);
					}
					
					for(int j = 0 ; j < tf.length ; j++) {
						tf[j].setText("");
						}
					
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		
		
		btn[2].addActionListener(new ActionListener() {   //���� ��ư

			public void actionPerformed(ActionEvent e) {
				try {					
					stmt.executeUpdate("update student2 set name='"+tf[1].getText()+"', dept='"+tf[2].getText()+"', address='"+tf[3].getText()+"' where id = '"+tf[0].getText()+"'");
					
					JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.");
					
					for(int j = 0 ; j < tf.length ; j++) {
						tf[j].setText("");
						}
					
					showList();
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		
		
		btn[3].addActionListener(new ActionListener() {   //���� ��ư

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
						if (JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?", "����", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
							ResultSet rs = stmt.executeQuery("select * from student2 where id = '"+tf[0].getText()+"'");
							String id = "";
							while (rs.next()) {
								id = rs.getString("id");	
							}
								if(tf[0].getText().equals(id)) {
									stmt.executeUpdate("delete from student2 where id = '"+tf[0].getText()+"'");
									for(int j = 0 ; j < tf.length ; j++) {
										tf[j].setText("");
									}
									JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.", "�����Ϸ�", JOptionPane.ERROR_MESSAGE);
									showList();
								}
								else
									JOptionPane.showMessageDialog(null, "�й��� Ȯ�����ּ���.", "ERROR", JOptionPane.ERROR_MESSAGE);
						}
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				
			}
		});
		
		this.setSize(320, 500);
		this.setVisible(true);
		showList();
	}
	public static void main(String[] args) {
		new Haksa();
	}
}