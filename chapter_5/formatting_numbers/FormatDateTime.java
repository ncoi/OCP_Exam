package formatting_numbers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dt = LocalDateTime.of(date, time);
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println("SHORT: " + shortDateTime.format(dt));
		System.out.println(shortDateTime.format(date));
		System.out.println("MEDIUM: " + mediumDateTime.format(dt));
		System.out.println(mediumDateTime.format(date));
//		System.out.println(shortDateTime.format(time));    trhows exception
		
		DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println("SHORT TIME: " + shortTime.format(time));
		
		
		// Creating custom formatter
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dt.format(f));
		
		
		// String to date or time
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date2 = LocalDate.parse("01 02 2015", f2);
		LocalTime time2 = LocalTime.parse("11:22");
		System.out.println(date2);
		System.out.println(time2);
	}

}
