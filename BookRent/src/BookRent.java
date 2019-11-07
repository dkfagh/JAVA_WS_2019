import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BookRent extends JFrame{
	Connection conn = null;
	DefaultTableModel model = null;
	JTable table = null;
	Statement stmt;
	String query;
	
	public BookRent() {
		
		query = "select s.id , s.name , b.title , br.rDate" + 
				" from student2 s, books b, bookrent br" + 
				" where s.id = br.id" + 
				" and b.no = br.bookNo";
		
		try {
			//DB����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:myoracle", "ora_user", "hong");
			stmt=conn.createStatement();   //sql�� ����
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		setTitle("�л�����");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //x��ư ������ ���α׷� ����
	   
	    setLayout(null);   //���̾ƿ�����. ���̾ƿ� ��� ����.
	   
	    JLabel l_dept=new JLabel("�а�");
	    l_dept.setBounds(10, 10, 30, 20);
	    add(l_dept);
	    
	    
	    String colName[]={"�й�","�̸�","������","������"};
	    model=new DefaultTableModel(colName,0);
	    table = new JTable(model);
	    table.setPreferredScrollableViewportSize(new Dimension(470,200));
	    add(table);
	    JScrollPane sp=new JScrollPane(table);
	    sp.setBounds(10, 40, 460, 250);
	    add(sp);
	   
	   
	    String[] dept={"��ü","��ǻ�Ͱ���","��Ƽ�̵��","�Ͼ��Ϲ���"};
	    JComboBox cb_dept=new JComboBox(dept);
	    
	    cb_dept.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				System.out.println(cb.getSelectedIndex());
				int si = cb.getSelectedIndex();
				
				query = "select s.id , s.name , b.title , br.rDate" + 
						" from student2 s, books b, bookrent br" + 
						" where s.id = br.id" + 
						" and b.no = br.bookNo";
				
				if(si==0) {   //��ü
					query += " order by br.no";
				} else if(si==1) {   //��ǻ�Ͱ���
					query += " and s.dept = '��ǻ�Ͱ���' order by br.no";
				} else if(si==2) {   //��Ƽ�̵��
					query += " and s.dept = '��Ƽ�̵��' order by br.no";
				} else if(si==3) {   //�Ͼ��Ϲ���
					query += " and s.dept = '�Ͼ��Ϲ���' order by br.no";
				}
				
				//�˻����
				list();
				
			}});
	    cb_dept.setBounds(45, 10, 100, 20);
	    add(cb_dept);
	    
	    setSize(490, 400);
	    setVisible(true);
	    
	    list();   //��ü���
	}
	
	public void list(){
	    try{
	     System.out.println("����Ǿ����ϴ�.....");
	     System.out.println(query);       
	     // Select�� ����     
	     ResultSet rs=stmt.executeQuery(query);
	    
	     //JTable �ʱ�ȭ
	     model.setNumRows(0);
	    
	     while(rs.next()){
	      String[] row=new String[4];//�÷��� ������ 4
	      row[0]=rs.getString("id");
	      row[1]=rs.getString("name");
	      row[2]=rs.getString("title");
	      row[3]=rs.getString("rdate");
	      model.addRow(row);
	     }
	     rs.close();
	    
	    }
	    catch(Exception e1){
	     //e.getStackTrace();
	     System.out.println(e1.getMessage());
	    }
	 }
	
	public static void main(String[] args) {
		new BookRent();
	}
}