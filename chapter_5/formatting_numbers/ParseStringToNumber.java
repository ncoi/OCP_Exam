package formatting_numbers;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ParseStringToNumber {

	public static void main(String[] args) throws ParseException {
		NumberFormat en = NumberFormat.getInstance(Locale.US);
		NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
		NumberFormat de = NumberFormat.getCurrencyInstance(Locale.US);
		
		String s = "40.45";
		System.out.println(en.parse(s)); // 40.45
		System.out.println(fr.parse(s)); // 40
		System.out.println(de.parse("$1,200"));
		
		NumberFormat nf = NumberFormat.getInstance();
		String one = "456abc";
		String two = "-2.5165x10";
		String three = "x85.3";
		System.out.println(nf.parse(one)); // 456
		System.out.println(nf.parse(two)); // -2.5165
		System.out.println(nf.parse(three));// throws ParseException
	}

}
