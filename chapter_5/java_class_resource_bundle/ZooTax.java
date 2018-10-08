package java_class_resource_bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ZooTax {

	public static void main(String[] args) {
		Locale us = new Locale("en","US");
		Locale fr = new Locale("fr");
		ResourceBundle rb = ResourceBundle.getBundle("java_class_resource_bundle.Tax", us);
		System.out.println(rb.getObject("tax"));
	}

}
