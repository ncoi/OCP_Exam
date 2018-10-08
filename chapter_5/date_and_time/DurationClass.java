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
		Duration everyTenSeconds = Duration.ofSeconds(3800);
		System.out.println(everyTenSeconds);                   // PT1H3M20S
		Duration everyMilli = Duration.ofMillis(1);
		System.out.println(everyMilli);                        // PT0.001S
		Duration everyNano = Duration.ofNanos(1);
		System.out.println(everyNano);                         // PT0.000000001S
		
		// Using ChronoUnit
		Duration ofDays = Duration.of(1, ChronoUnit.DAYS);
		System.out.println(ofDays);                               // PT24H
		Duration ofHours = Duration.of(1, ChronoUnit.HOURS);
		System.out.println(ofHours);                              // PT1H
		Duration ofMinutes = Duration.of(1, ChronoUnit.MINUTES);
		System.out.println(ofMinutes);                            // PT1M
		Duration ofSeconds = Duration.of(1, ChronoUnit.SECONDS);
		System.out.println(ofSeconds);                            // PT1S
		Duration ofMillis = Duration.of(1, ChronoUnit.MILLIS);
		System.out.println(ofMillis);                             // PT0.001S
		Duration ofNanos = Duration.of(1, ChronoUnit.NANOS);
		System.out.println(ofNanos);                              // PT0.000000001S
	}

}
