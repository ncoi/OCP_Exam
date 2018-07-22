package resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScrollingResultSet {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:derby:zoo";
		try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement(
				ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY
		)) {
			// stmt.executeUpdate("DROP TABLE animal");
			stmt.executeUpdate("DROP TABLE species");

			stmt.executeUpdate("CREATE TABLE species (" + "id INTEGER PRIMARY KEY, " + "name VARCHAR(255), "
					+ "num_acres DECIMAL(4,1))");

			stmt.executeUpdate("INSERT INTO species VALUES (1, 'Zebra', 1.2)");
			stmt.executeUpdate("INSERT INTO species VALUES (2, 'African Elephant', 7.5)");
			stmt.executeUpdate("INSERT INTO species VALUES (3, 'Iguana', 8.2)");

			ResultSet rs = stmt.executeQuery("select id from species order by id");
			
			rs.absolute(-3);
			String id = rs.getString(1);
			System.out.println("Absolute: " + id);
//			rs.afterLast();
//			System.out.println(rs.previous());
//			System.out.println("Previous: " + rs.getInt(1));
//			System.out.println(rs.previous());
//			System.out.println("Previous: " + rs.getInt(1));
//			System.out.println(rs.last());
//			System.out.println("Last: " +rs.getInt(1));
//			System.out.println(rs.first());
//			System.out.println("First: " +rs.getInt(1));
		}

	}
}
