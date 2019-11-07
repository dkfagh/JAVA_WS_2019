import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Ex2 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:myoracle", "ora_user", "hong");
			System.out.println("����Ϸ�");
			
			stmt = conn.createStatement();
			
			
			//stmt.executeUpdate("insert into student2 (id, name, dept) values('0893012', '�ƹ���', '��ǻ�Ͱ���')");
			//stmt.executeUpdate("update student2 set dept = 'ö��' where id = '1091011'");
			
			//String sql = "delete from student2 where id = '0792012'";
			//stmt.executeUpdate(sql);
			
						
			ResultSet rs = stmt.executeQuery("select * from student2");
			while(rs.next()) {
				System.out.print(rs.getString("id") + " / ");
				System.out.print(rs.getString("name") + " / ");
				System.out.println(rs.getString("dept"));
				
				
//				System.out.println(rs.getString(1));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
			}
			
			rs.close();   //Ŀ�� ����  / ������ �����Ǿ�����
			conn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}