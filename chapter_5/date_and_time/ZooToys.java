package date_and_time;

import java.time.*;

public class ZooToys {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1);
		performAnimalEnrichment(start, end, period);
		
		
		// Five ways to create a Period class 
		Period anually = Period.ofYears(1);               // every 1 year
		Period quarterly = Period.ofMonths(3);            // every 3 months
		Period everyThreeWeeks = Period.ofWeeks(3);       // every 3 weeks
		Period everyOtherDay = Period.ofDays(2);          // every 2 days
		Period everyYearAndAWeek = Period.of(1, 0, 7);    // every year and 7 days
		
		System.out.println(everyOtherDay);
	}
	
	public static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
		LocalDate upTo = start;
		while(upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period);
		}
	}

}
