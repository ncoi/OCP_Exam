package i18n_l10n;

import java.util.Locale;

public class LocaleClass {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale);

		// Constants of some of the most commonly used locales
		System.out.println(Locale.GERMAN);
		System.out.println(Locale.GERMANY);
		
		// Constructors
		System.out.println(new Locale("fr"));
		System.out.println(new Locale("hi", "IN"));
		
		// Builder design pattern
		Locale l1 = new Locale.Builder().setLanguage("en").setRegion("US").build();
		System.out.println(l1);
		
		// Legal, but don't do this
		Locale l2 = new Locale.Builder().setLanguage("EN").setRegion("us").build();
		System.out.println(l2);             // en_US
		
		// Change default 
		Locale locale1 = new Locale("fr");
		Locale.setDefault(locale1);
		System.out.println(Locale.getDefault());
	}

}
