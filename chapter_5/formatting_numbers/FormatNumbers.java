package formatting_numbers;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumbers {

	public static void main(String[] args) {
		int attendeesPerYear = 3_200_000;
		int attendeesPerMonth = attendeesPerYear / 12;
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		System.out.println(us.format(attendeesPerMonth));
		NumberFormat fr1 = NumberFormat.getNumberInstance(Locale.CANADA_FRENCH);
		System.out.println(fr1.format(attendeesPerMonth));
		NumberFormat fr2 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(fr2.format(attendeesPerMonth));
		NumberFormat fr3 = NumberFormat.getPercentInstance(Locale.US);
		System.out.println(fr3.format(attendeesPerMonth));
		NumberFormat fr4 = NumberFormat.getIntegerInstance(Locale.US);
		System.out.println(fr4.format(attendeesPerMonth));
	}

}
