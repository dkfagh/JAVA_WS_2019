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
			//DB연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:myoracle", "ora_user", "hong");
			stmt=conn.createStatement();   //sql문 실행
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		setTitle("학생관리");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //x버튼 누르면 프로그램 종료
	   
	    setLayout(null);   //레이아웃설정. 레이아웃 사용 안함.
	   
	    JLabel l_dept=new JLabel("학과");
	    l_dept.setBounds(10, 10, 30, 20);
	    add(l_dept);
	    
	    
	    String colName[]={"학번","이름","도서명","대출일"};
	    model=new DefaultTableModel(colName,0);
	    table = new JTable(model);
	    table.setPreferredScrollableViewportSize(new Dimension(470,200));
	    add(table);
	    JScrollPane sp=new JScrollPane(table);
	    sp.setBounds(10, 40, 460, 250);
	    add(sp);
	   
	   
	    String[] dept={"전체","컴퓨터공학","멀티미디어","일어일문학"};
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
				
				if(si==0) {   //전체
					query += " order by br.no";
				} else if(si==1) {   //컴퓨터공학
					query += " and s.dept = '컴퓨터공학' order by br.no";
				} else if(si==2) {   //멀티미디어
					query += " and s.dept = '멀티미디어' order by br.no";
				} else if(si==3) {   //일어일문학
					query += " and s.dept = '일어일문학' order by br.no";
				}
				
				//검색목록
				list();
				
			}});
	    cb_dept.setBounds(45, 10, 100, 20);
	    add(cb_dept);
	    
	    setSize(490, 400);
	    setVisible(true);
	    
	    list();   //전체목록
	}
	
	public void list(){
	    try{
	     System.out.println("연결되었습니다.....");
	     System.out.println(query);       
	     // Select문 실행     
	     ResultSet rs=stmt.executeQuery(query);
	    
	     //JTable 초기화
	     model.setNumRows(0);
	    
	     while(rs.next()){
	      String[] row=new String[4];//컬럼의 갯수가 4
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