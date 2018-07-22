package date_and_time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class InstantClass {

	public static void main(String[] args) {
		Instant now = Instant.now();
		Instant later = Instant.now();
		
		Duration duration = Duration.between(now, later);
		System.out.println(duration.toMillis());
		
		// Turn a ZonedDateTime into an Instant
		LocalDate date = LocalDate.of(2015, 5, 25);
		LocalTime time = LocalTime.of(11, 55, 00);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
		
		Instant instant = zonedDateTime.toInstant();
		
		System.out.println("Time with zone: " + zonedDateTime);
		System.out.println("Time as instant: " + instant);               // Transformed to GMT
		
		Instant instantEpoch = Instant.ofEpochSecond(1418385600);
		System.out.println("Instant of Epoch: " + instantEpoch);
		Instant instantEpoch2 = Instant.ofEpochSecond(0);
		System.out.println("Instant of Epoch 2: " + instantEpoch2);
		
		
		// Add unit day or smaller to an Instant
		Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
		System.out.println(nextDay);
		Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
		System.out.println(nextHour);
//		Instant nextWeek = instant.plus(1, ChronoUnit.WEEKS);     exception
		
		
	}

}
