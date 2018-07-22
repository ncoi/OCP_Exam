package date_and_time;
import java.time.*;

public class DateRecap {
	public static void main(String []args) {
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		
		LocalTime time1 = LocalTime.of(6, 15);           // hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30);       // + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200);  // + nanoseconds
		
		LocalDateTime dt1 = LocalDateTime.of(2015, Month.APRIL, 20, 6, 15, 30);
		LocalDateTime dt2 = LocalDateTime.of(date1, time1);
		
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zdt1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 200, zone);    // Can't pass the Month Enum
		ZonedDateTime zdt2 = ZonedDateTime.of(dt1, zone);
		ZonedDateTime zdt3 = ZonedDateTime.of(date1, time1, zone);
		
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		System.out.println(ZoneId.systemDefault());
	}
}
