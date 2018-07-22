package resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class RSgetObject {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:derby:zoo";
		try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {
//			stmt.executeUpdate("DROP TABLE animal");
			stmt.executeUpdate("DROP TABLE species");

			stmt.executeUpdate("CREATE TABLE species (" + "id INTEGER PRIMARY KEY, " + "name VARCHAR(255), "
					+ "num_acres DECIMAL(4,1))");

			stmt.executeUpdate("INSERT INTO species VALUES (1, 'Zebra', 1.2)");
			stmt.executeUpdate("INSERT INTO species VALUES (2, 'African Elephant', 7.5)");

			ResultSet rs = stmt.executeQuery("select id, name from species");
			
			while (rs.next()) {
				Object id = rs.getObject("id");
				Object name = rs.getObject("name");
				if(id instanceof Integer) {
//					int newId = (Integer)id;
					System.out.println(id);
				}
				
				if(name instanceof String) {
					System.out.println(name);
				}
			}

		}

	}

}
