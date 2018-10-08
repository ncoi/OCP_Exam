package rethrowing_exceptions;

import java.sql.SQLException;
import java.text.ParseException;
import java.time.format.DateTimeParseException;

public class RethrowException {
	public void parseData() throws SQLException, ParseException, DateTimeParseException {
		
	}
	
	public void multiCatch() throws SQLException, ParseException {
		try {
			parseData();
		} catch(Exception e) {
			System.err.println(e);
			throw e;
		}
	}
	
	public static void main(String[] args) {
		
	}
}
