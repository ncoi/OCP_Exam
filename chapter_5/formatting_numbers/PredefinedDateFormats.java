package formatting_numbers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class PredefinedDateFormats {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(23, 30, 20, 200);
		LocalDateTime ldt = LocalDateTime.of(date, time);
		
		DateTimeFormatter shortDate = 
				DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter shortTime =
				DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(shortDate.format(date));     // 1/20/15
		System.out.println(shortDate.format(ldt));      // 1/20/15
		System.out.println(shortTime.format(time));     // 11:30 PM
	}

}
