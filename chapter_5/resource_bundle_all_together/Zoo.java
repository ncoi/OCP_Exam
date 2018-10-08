package resource_bundle_all_together;

import java.util.Locale;
import java.util.ResourceBundle;

public class Zoo {
	public static void main(String[] args) {
		Locale local = new Locale("en","CA");
		ResourceBundle rb = ResourceBundle.getBundle("resource_bundle_all_together.Zoo", local);
		System.out.print(rb.getString("hello"));
		System.out.print(". ");
		System.out.print(rb.getString("name"));
		System.out.print(" ");
		System.out.print(rb.getString("open"));
		System.out.print(" ");
		System.out.print(rb.getString("visitor"));
	}
}
