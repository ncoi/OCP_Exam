package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {

	public static void main(String[] args) {
		// filter()
		Stream<String> fil = Stream.of("monkey","donkey","gorilla");
		fil.filter(s -> s.startsWith("m")).forEach(System.out::println);
		
		// distinct()
		Stream<String> disc = Stream.of("duck","duck","duck","goose");
		disc.distinct().forEach(System.out::println);
		
		// limit() and skip()
		Stream<Integer> s = Stream.iterate(1, n -> n + 1);
		s.skip(5).limit(2).forEach(System.out::println);
		
		// map()
		Stream<String> st = Stream.of("monkey", "gorilla", "bonobo");
		st.map(String::length).forEach(System.out::println);
		
		
		// flatMap()
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla","Baby Gorilla");
		
		Stream<List<String>> animals = Stream.of(zero, one, two);
		Stream<String> a = animals.flatMap(m -> m.stream());
		a.forEach(System.out::println);
	}

}
