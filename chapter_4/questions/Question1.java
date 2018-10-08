package questions;

import java.util.stream.Stream;

public class Question1 {

	public static void main(String[] args) {
		Stream<String> stream = Stream.iterate("", (s) -> s + "1");
		stream.limit(2).map(x -> x + "2").forEach(System.out::println);
		
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
		oddNumbers.limit(3).forEach(System.out::println);
	}

}
