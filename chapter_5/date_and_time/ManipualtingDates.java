package date_and_time;

import java.time.*;

public class ManipualtingDates {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date1);
		date1 = date1.plusDays(2);   // 2014-01-22
		System.out.println(date1);
		date1 = date1.plusWeeks(1);  // 2014-01-29
		System.out.println(date1);
		date1 = date1.plusMonths(1); // 2014-02-28
		System.out.println(date1);
		date1 = date1.plusYears(5);  // 2019-02-28
		System.out.println(date1);
		
		
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time1 = LocalTime.of(5, 15);
		LocalDateTime dt1 = LocalDateTime.of(date2, time1);
		dt1 = dt1.minusDays(1);
		System.out.println(dt1);           // 2020-01-20T05:15
		dt1 = dt1.minusHours(10);
		System.out.println(dt1);           // 2020-01-19T05:15
		dt1 = dt1.minusSeconds(30);
		System.out.println(dt1);           // 2020-01-18T19:14:30
		
		dt1 = dt1.minusDays(1).minusHours(10).minusSeconds(30);
		
		LocalDate ld = LocalDate.of(2018, 9, 18);
		ld = ld.minusWeeks(1);
		System.out.println(ld.toEpochDay());
	}

}
