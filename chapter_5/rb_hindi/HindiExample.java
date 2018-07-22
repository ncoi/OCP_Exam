package rb_hindi;

import java.util.*;

public class HindiExample {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("hi"));
		ResourceBundle rb = ResourceBundle.getBundle("rb_hindi.Zoo", new Locale("en"));
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("open"));
	}
}
