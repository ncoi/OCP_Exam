package jdbc_package;

import java.sql.*;
import java.util.*;

public class ReadingResultSet {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:derby:zoo";
		try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {
			stmt.executeUpdate("DROP TABLE species");

			stmt.executeUpdate("CREATE TABLE species (" + 
			"id INTEGER PRIMARY KEY, " + "name VARCHAR(255), "
					+ "num_acres DECIMAL(4,1))");
			
			stmt.executeUpdate("INSERT INTO species VALUES (1, 'Zebra', 1.2)");
			stmt.executeUpdate("INSERT INTO species VALUES (2, 'African Elephant', 7.5)");
			
			ResultSet rs = stmt.executeQuery("select id, name from species");
			Map<Integer, String> idToNameMap = new HashMap<>();
			while(rs.next() ) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				idToNameMap.put(id, name);
			}
			
			System.out.println(idToNameMap);
			
			ResultSet rs2 = stmt.executeQuery("select count(*) from species");
			if(rs2.next())
				System.out.println(rs2.getInt(1));

		}

	}

}
