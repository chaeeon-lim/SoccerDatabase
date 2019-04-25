import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysqltest {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql:address of database/database name?options"; // DB Server address DNS or IP
	static final String USERNAME = "put database id here"; // DB ID
	static final String PASSWORD = "put database passwd here"; // DB Password

	public static void main(String[] args) {
		// Some of objects for database
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		System.out.print("User Table 접속 : ");
		try {
			Class.forName(JDBC_DRIVER); // Making a Class Object for JDBC Driver.
			conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD); // connect to database
			
			// print out the result.
			if (conn != null){System.out.println("성공");}
			else{System.out.println("실패");}
				
		} catch (ClassNotFoundException e) {
			System.out.println("Class Not Found Exection");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL Exception : " + e.getMessage());
			e.printStackTrace();
		}	

	}

}


// referenced: https://kingpodo.tistory.com/17 [킹포도의 코딩]