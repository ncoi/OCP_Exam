package formatting_numbers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDateTime {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.of(2015, 9, 25);
		System.out.println(ld);                     // 2015-09-25
		System.out.println(ld.getDayOfWeek());      // FRIDAY
		System.out.println(ld.getMonth());          // SEPTEMBER
		System.out.println(ld.getYear());           // 2015
		System.out.println(ld.getDayOfYear());      // 268
		
		LocalDate date = LocalDate.of(2018, 2, 23);
		LocalTime time = LocalTime.of(11, 28);
		LocalDateTime localdt = LocalDateTime.of(date, time);
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));         // 2018-02-23
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));         // 11:28:00
		System.out.println(localdt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // 2018-02-23T11:28:00
	}
}
