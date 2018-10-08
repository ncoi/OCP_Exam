package i18n_l10n;

import java.util.Locale;

public class LocaleClass {

	public static void main(String[] args) {
		Locale local = Locale.getDefault();
		System.out.println(local);            // en_US
		
		Locale ger = Locale.GERMAN;
		Locale gerLang = Locale.GERMANY;
		System.out.println("Lang: " + ger);                   // de
		System.out.println("Lang and Country: " + gerLang);   // de_DE
		
		Locale french = new Locale("fr");
		Locale india = new Locale("hi","IN");
		System.out.println("French: " + french);              // fr
		System.out.println("India: " + india);                // hi_IN	
		
		// Java let's you create a Locale with an invalid value
		Locale invalid = new Locale("popo"); 
		System.out.println(invalid);
		
		Locale america = new Locale.Builder()
				.setRegion("US")
				.setLanguage("en")
				.build();
		
		System.out.println(america);
	}

}
