package stream;

import java.util.stream.Stream;

public class TerminalOperations {
	public static void main(String[] args) {
		// count()
		Stream<String> s = Stream.of("monkey","gorilla","bonobo");
		System.out.println(s.count());
		
		
	}
}
