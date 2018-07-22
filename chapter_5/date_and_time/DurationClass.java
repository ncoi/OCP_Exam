package date_and_time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationClass {

	public static void main(String[] args) {
		Duration daily = Duration.ofDays(1);
		System.out.println(daily);                             // PT24H
		Duration hourly = Duration.ofHours(1);
		System.out.println(hourly);                            // PT1H
		Duration everyMinute = Duration.ofMinutes(1);
		System.out.println(everyMinute);                       // PT1M
		Duration everyTenSeconds = Duration.ofSeconds(10);
		System.out.println(everyTenSeconds);                   // PT10S
		Duration everyMilli = Duration.ofMillis(1);
		System.out.println(everyMilli);                        // PT0.001S
		Duration everyNano = Duration.ofNanos(1);
		System.out.println(everyNano);                         // PT0.000000001S
		
		Duration daily1 = Duration.of(1, ChronoUnit.HALF_DAYS);
		System.out.println(daily1);                            // PT12H
		Duration hourly1 = Duration.of(1, ChronoUnit.HOURS);
		Duration everyMinute1 = Duration.of(1, ChronoUnit.MINUTES);
		Duration everyTenSeconds1 = Duration.of(10, ChronoUnit.SECONDS);
		Duration everyMilli1 = Duration.of(10, ChronoUnit.MILLIS);
		Duration everyNano1 = Duration.of(10, ChronoUnit.NANOS);
		
		
		// Question 15
		String m1 = Duration.of(1, ChronoUnit.MINUTES).toString();
		String m2 = Duration.ofMinutes(1).toString();
		String s = Duration.of(66, ChronoUnit.SECONDS).toString();
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(s);
	}

}
