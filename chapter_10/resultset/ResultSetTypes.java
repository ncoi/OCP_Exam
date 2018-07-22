package resultset;

import java.sql.*;
import java.time.*;

public class ResultSetTypes {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:derby:zoo";
		try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {
			stmt.executeUpdate("DROP TABLE animal");

			stmt.executeUpdate("CREATE TABLE animal (" +"id INTEGER PRIMARY KEY, "
					+ "species_id integer REFERENCES species (id), " +
					"name VARCHAR(255), " + "date_born TIMESTAMP)");
			
			stmt.executeUpdate("INSERT INTO animal VALUES (1, 1, 'Elsa', '2001-05-06 02:15:00')");
			stmt.executeUpdate("INSERT INTO animal VALUES (2, 2, 'Zelda', '2002-08-15 09:12:00')");
			
			ResultSet rs = stmt.executeQuery("select date_born from animal where name='Elsa'");
			if(rs.next()) {
				java.sql.Date date = rs.getDate(1);
				LocalDate ld = date.toLocalDate();
				System.out.println(ld);
				
				java.sql.Time time = rs.getTime(1);
				LocalTime lt = time.toLocalTime();
				System.out.println(lt);
				
				java.sql.Timestamp timestamp = rs.getTimestamp(1);
				LocalDateTime ldt = timestamp.toLocalDateTime();
				System.out.println(ldt);
			}
		}
	}

}
