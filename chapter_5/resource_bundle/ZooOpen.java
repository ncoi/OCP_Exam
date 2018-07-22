package resource_bundle;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class ZooOpen {

	public static void main(String[] args) {
		Locale us = new Locale("en", "US");
		Locale france = new Locale("fr", "FR");
		printProperties(us);
		printProperties(france);
		
		ResourceBundle rb = ResourceBundle.getBundle("java_class_resource_bundle.Zoo", us);
		Set<String> keys = rb.keySet();
		System.out.println(keys);      // [hello, open, key, long]
		keys.stream().map(k -> k + " " + rb.getString(k)).forEach(System.out::println);
		
		// Properties class
		Properties props = new Properties();
		rb.keySet().stream().forEach(k -> props.put(k, rb.getString(k)));
		
		System.out.println(props.getProperty("notReallyAProperty"));            // null
		System.out.println(props.getProperty("notReallyAProperty", "123"));     // 123
	}
	
	public static void printProperties(Locale locale) {
		ResourceBundle rb = ResourceBundle.getBundle("java_class_resource_bundle.Zoo", locale);
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("open"));
	}

}
