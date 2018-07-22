package formatting_numbers;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParseStringToNumber {

	public static void main(String[] args) throws ParseException {
		// Parsin String to number
		NumberFormat en = NumberFormat.getInstance();
		NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
		String s = "40.45";
		System.out.println(en.parse(s));
		System.out.println(fr.parse(s));
		
		String a = "x85.3";
//		System.out.println(en.parse(a));             // Unparseable number: "x85.3"
		
		// Parsing String to currency
		String amt = "$92,807.99";
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		double value = (double)cf.parse(amt);          // parse returns a Number object
		System.out.println(value);
	}

}
