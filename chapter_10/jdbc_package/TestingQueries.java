package jdbc_package;

import java.sql.*;

public class TestingQueries {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:derby:zoo";
		try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {
			stmt.executeUpdate("DROP TABLE species");
			
			stmt.executeUpdate("CREATE TABLE species ("
		            + "id INTEGER PRIMARY KEY, "
		        + "name VARCHAR(255), "
		        + "num_acres DECIMAL(4,1))");
			
//			String sql = "INSERT INTO species VALUES (2, 'Zebra', 1.2)";
			String sql ="select count(*) from species";
			boolean isResultSet = stmt.execute(sql);
			if (isResultSet) {
				ResultSet rs = stmt.getResultSet();
				System.out.println("ran a query: " + rs);
			} else {
				int result = stmt.getUpdateCount();
				System.out.println("ran an update: " + result);
			}

		}
	}
}
