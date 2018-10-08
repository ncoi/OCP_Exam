package resource_bundle;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class ZooOpen {
	private static void printProperties(Locale locale) {
		ResourceBundle rb = ResourceBundle.getBundle("java_class_resource_bundle.Zoo", locale);
//		System.out.println(rb.getString("hello"));
//		System.out.println(rb.getString("open"));
//		System.out.println();
		Set<String> keys = rb.keySet();
		keys.stream().map(k -> k + " " + rb.getString(k))
			.forEach(System.out::println);
		
		Properties props = new Properties();
		rb.keySet().stream()
			.forEach(k -> props.put(k, rb.getString(k)));
		
		System.out.println(props.getProperty("hi"));
		System.out.println(props.getProperty("hi","default"));
	}

	public static void main(String[] args) {
		Locale us = new Locale("en","US");
		Locale fr = new Locale("fr","FR");
		
		printProperties(us);
		printProperties(fr);
	}

}
