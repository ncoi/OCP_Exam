package date_and_time;
import java.time.*;

public class DateRecap {
	public static void main(String []args) {
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		
		Month month = Month.JANUARY;
//		boolean b1 = month == 1; // DOES NOT COMPILE
		boolean b2 = month == Month.APRIL; // false
		
		LocalTime time1 = LocalTime.of(6, 15);           // hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30);       // + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200);  // + nanoseconds
		
		LocalDateTime dt1 = LocalDateTime.of(2015, Month.APRIL, 20, 6, 15, 30, 200);
		LocalDateTime dt2 = LocalDateTime.of(date1, time1);
		
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zdt1 = ZonedDateTime.of(2015, 1, 9, 6, 15, 30, 200, zone);    // Can't pass the Month Enum
		ZonedDateTime zdt2 = ZonedDateTime.of(dt1, zone);
		ZonedDateTime zdt3 = ZonedDateTime.of(date1, time1, zone);
		
		
		System.out.println(LocalDate.now());          // 2018-09-18
		System.out.println(LocalTime.now());          // 11:34:16.604
		System.out.println(LocalDateTime.now());      // 2018-09-18T11:34:16.604
		System.out.println(ZonedDateTime.now());      // 2018-09-18T11:34:16.604-06:00[America/Regina]
		System.out.println(ZoneId.systemDefault());   // America/Regina
		
		ZoneId.getAvailableZoneIds().stream()
		.filter(z -> z.contains("Costa"))
		.sorted().forEach(System.out::println);
	}
}
