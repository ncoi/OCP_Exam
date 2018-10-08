package formatting_numbers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ParseDate {

	public static void main(String[] args) {
		String newDate = "01 02 2015";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date = LocalDate.parse(newDate, dtf);
		LocalTime time = 
				LocalTime.parse("11:30 AM", DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
		System.out.println(time); // 11:30
		System.out.println(date); // 2015-01-02
	}

}
