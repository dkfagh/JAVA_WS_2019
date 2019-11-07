import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc_01 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:myoracle", "ora_user", "hong");
			System.out.println("연결완료");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}