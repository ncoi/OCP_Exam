package date_and_time;

import java.time.*;

public class DaylightSavingsTime {

	public static void main(String[] args) {
		ZonedDateTime zdt = ZonedDateTime.of(2016, 3, 13, 1, 30, 0, 0, ZoneId.of("US/Eastern"));
		System.out.println(zdt);
		
		zdt = zdt.plusHours(1);
		System.out.println(zdt);
		
		// Trying to create a time that doesn't exists
		ZonedDateTime zdt1 = ZonedDateTime.of(2016, 3, 13, 2, 30, 0, 0, ZoneId.of("US/Eastern"));
		System.out.println(zdt1);               // 2016-03-13T03:30-04:00[US/Eastern]
	}

}
