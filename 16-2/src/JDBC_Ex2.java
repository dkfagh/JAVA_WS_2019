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
			System.out.println("연결완료");
			
			stmt = conn.createStatement();
			
			
			//stmt.executeUpdate("insert into student2 (id, name, dept) values('0893012', '아무개', '컴퓨터공학')");
			//stmt.executeUpdate("update student2 set dept = '철학' where id = '1091011'");
			
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
			
			rs.close();   //커서 닫음  / 오픈은 생략되어있음
			conn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}