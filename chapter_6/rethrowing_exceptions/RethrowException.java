package rethrowing_exceptions;

import java.sql.SQLException;
import java.time.format.DateTimeParseException;

public class RethrowException {

	public static void main(String[] args) throws SQLException {
		multiCatch();
	}
	
	public static void multiCatch( ) throws SQLException, DateTimeParseException {
		try {
			parseData();
		} catch(Exception e) {
			System.err.println(e);
			throw e;
		}
	}
	
	public static void parseData() throws SQLException, DateTimeParseException {
		throw new SQLException();
	}

}
