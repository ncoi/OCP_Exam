package formatting_numbers;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumbers {

	public static void main(String[] args) {
		// Format numbers
		int attendeesPerYear = 3_200_000;
		int attendeedPerMonth = attendeesPerYear / 12;
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		System.out.println(us.format(attendeedPerMonth));
		NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
		System.out.println(g.format(attendeedPerMonth));
		NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		System.out.println(ca.format(attendeedPerMonth));
		
		// Format Currency
		BigDecimal price = new BigDecimal(48);
		NumberFormat us_c = NumberFormat.getCurrencyInstance();
		System.out.println(us_c.format(price));
		NumberFormat g_c = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		System.out.println(g_c.format(price));
		NumberFormat ca_c = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
		System.out.println(ca_c.format(price));
	}

}
