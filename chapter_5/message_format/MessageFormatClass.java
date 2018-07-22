package message_format;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class MessageFormatClass {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("message_format.Greetings");
		String greeting = rb.getString("helloByName");
		String formattedGreeting = MessageFormat.format(greeting, "Nelson");
		System.out.println(formattedGreeting);
	}

}
