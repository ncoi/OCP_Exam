package console_class;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleExample {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = bufferedReader.readLine();
		
		System.out.println("You entered the following: " + line);
		Console console = System.console();
		
//		System.out.println(console);
//		if(console != null) {
//			String userInput = console.readLine();
//			console.writer().println("You entered the following: " + userInput);
//		}
//		
//		console.writer().println("Welcome to Our Zoo!");
//		console.format("Our zoo has 391 animals and employs 25 people.");
//		console.writer().println();
//		console.printf("The zoo spans 128.91 acres.");
		
	}

}
