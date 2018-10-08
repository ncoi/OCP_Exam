package formatting_numbers;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class CustomFormat {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.of(2015, Month.FEBRUARY, 20, 11, 23, 30);
		
		DateTimeFormatter customDateTime = 
				DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(customDateTime.format(ldt));               // February 20, 2015, 11:23
		
	}

}
