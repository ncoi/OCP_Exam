package jdbc_package;

import java.sql.*;

public class TestConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
		System.out.println(conn);
	}

}
