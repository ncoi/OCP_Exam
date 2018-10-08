package print_classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class PrintWriterExample {

	public static void main(String[] args) throws IOException {
		File file = new File("pw.log");
		String s = "Hello World";
	
		try(PrintWriter pw = new PrintWriter(
							  new BufferedWriter(
							   new FileWriter(file)))) {
			pw.print("Today's weather is: ");
			pw.println("Sunny");
			pw.print("Today's temperature at the zoo is: ");
			pw.print(1/3.0);
			pw.println('C');
			pw.format("It has rained 10.12 inches this year");
			pw.println();
			pw.format(Locale.UK, "This is a %s program with %d", s, 100);
			pw.println();
			pw.printf("It may rain 21.2 more inches this year");
		}
	}

}
