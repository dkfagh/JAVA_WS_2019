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
	private String [] data = {"학번", "이름", "학과", "주소"};
	private String [] comp = {"등록", "목록", "수정", "삭제"};
	private JTextField [] tf = new JTextField [4];
	private JButton [] btn = new JButton [4];
	private JButton btnSearch = new JButton("검색");
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
		
		//DB연동
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:myoracle", "ora_user", "hong");
			stmt = conn.createStatement();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		this.setTitle("학사관리");
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
		
		String colName[]={"학번","이름","학과","주소"};   //표에 출력할 컬럼명
		  model=new DefaultTableModel(colName,0);   //표의 데이터
		  table = new JTable(model);   //테이블에 모델(데이터) 바인딩
		  table.setPreferredScrollableViewportSize(new Dimension(270,270));   //테이블 사이즈
		  c.add(new JScrollPane(table));
		  

		  table.addMouseListener(new MouseListener() {   //마우스로 데이터 선택 시 텍스트필드에 선택된 로우의 데이터 출력
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
//		c.add(sp);                                 //JTextArea를 만들고 JScrollPane에 넣어서 add
		
		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(comp[i]);
			c.add(btn[i]);
		}
		
		
		btnSearch.addActionListener(new ActionListener() {   //검색 버튼

			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					rs = stmt.executeQuery("select * from student2 where id = '"+tf[0].getText()+"'");
					
//					taList.setText("");   //초기화 -> 목록 버튼을 부를때 중복 출력 방지
//					
//					taList.append("======================================\n");
//					taList.append(" 학번	이름	학과	주소\n");
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
		
		
		btn[0].addActionListener(new ActionListener() {   //등록 버튼

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
							JOptionPane.showMessageDialog(null, "(*)항목은 필수 입력사항입니다.", "Error", JOptionPane.ERROR_MESSAGE);
							break;
							}
						else if(i == tf.length-1){
							stmt.executeUpdate("insert into student2 (id, name, dept, address) values('"+tf[0].getText()+"', '"+tf[1].getText()+"', '"+tf[2].getText()+"', '"+tf[3].getText()+"')");
							JOptionPane.showMessageDialog(null, "등록되었습니다.");
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
//							JOptionPane.showMessageDialog(null, "(*)항목은 필수 입력사항입니다.", "Error", JOptionPane.ERROR_MESSAGE);
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
		
		
		btn[1].addActionListener(new ActionListener() {   //목록 버튼

			@Override
			public void actionPerformed(ActionEvent e) {				
				try {					
					rs = stmt.executeQuery("select * from student2");
					
//					taList.setText("");   //초기화 -> 목록 버튼을 부를때 중복 출력 방지
//					
//					taList.append("======================================\n");
//					taList.append(" 학번	이름	학과	주소\n");
//					taList.append("======================================\n");
//					
//					while(rs.next()) {
//						taList.append(rs.getString("id") + "\t");
//						taList.append(rs.getString("name") + "\t");
//						taList.append(rs.getString("dept") + "\n");
					
					
					//목록 초기화
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
		
		
		btn[2].addActionListener(new ActionListener() {   //수정 버튼

			public void actionPerformed(ActionEvent e) {
				try {					
					stmt.executeUpdate("update student2 set name='"+tf[1].getText()+"', dept='"+tf[2].getText()+"', address='"+tf[3].getText()+"' where id = '"+tf[0].getText()+"'");
					
					JOptionPane.showMessageDialog(null, "수정되었습니다.");
					
					for(int j = 0 ; j < tf.length ; j++) {
						tf[j].setText("");
						}
					
					showList();
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		
		
		btn[3].addActionListener(new ActionListener() {   //삭제 버튼

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
						if (JOptionPane.showConfirmDialog(null, "삭제하시겠습니까?", "삭제", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
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
									JOptionPane.showMessageDialog(null, "삭제되었습니다.", "삭제완료", JOptionPane.ERROR_MESSAGE);
									showList();
								}
								else
									JOptionPane.showMessageDialog(null, "학번을 확인해주세요.", "ERROR", JOptionPane.ERROR_MESSAGE);
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