package variables_in_bundles;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class Person {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("variables_in_bundles.Person");
		String format = rb.getString("hello");
		String formatted = MessageFormat.format(format, "Hola", "Nelson");
		System.out.println(formatted);
	}
}
