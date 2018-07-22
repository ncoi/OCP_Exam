package date_and_time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class ChronoUnitClass {

	public static void main(String[] args) {
		LocalTime one = LocalTime.of(5, 15);
		LocalTime two = LocalTime.of(6, 30);
		LocalDateTime date1 = LocalDateTime.of(2016, 1, 20, 6, 20);
		LocalDateTime date2 = LocalDateTime.of(2018, 5, 18, 5, 6);
		
		System.out.println(ChronoUnit.HOURS.between(one, two));
		System.out.println(ChronoUnit.MINUTES.between(one, two));
		System.out.println(ChronoUnit.HOURS.between(date1, date2));
		
		
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6,  15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		Duration duration = Duration.ofHours(23);
		
		System.out.println(dateTime.plus(duration));
		System.out.println(time.plus(duration));
//		System.out.println(date.plus(duration));        UnsupportedTemporalException

		Period period = Period.ofDays(1);
		Duration days = Duration.ofDays(1);
		
		System.out.println("Period 1 day: " + period);
		System.out.println("Duration 1 day: " + days);
		
		System.out.println(date.plus(period));
//		System.out.println(date.plus(duration));          Unsupported unit: Seconds
		
	}

}
