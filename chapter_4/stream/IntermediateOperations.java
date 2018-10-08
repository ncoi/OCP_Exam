package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {

	public static void main(String[] args) {
		// filter()
		System.out.println("filter:");
		Stream<String> fil = Stream.of("monkey","donkey","gorilla");
		fil.filter(s -> s.startsWith("m")).forEach(System.out::println);
		
		// distinct()
		System.out.println("distinct:");
		Stream<String> disc = Stream.of("duck","duck","duck","goose");
		disc.distinct().forEach(System.out::println);
		
		// limit() and skip()
		System.out.println("limit and skip:");
		Stream<Integer> s = Stream.iterate(1, n -> n + 1);
		s.skip(5).limit(2).forEach(System.out::println);
		
		// map()
		System.out.println("map:");
		List<String> zeroo = Arrays.asList();
		List<String> onee = Arrays.asList("Bonobo");
		List<String> twoo = Arrays.asList("Mama Gorilla","Baby Gorilla");
//		Stream<String> st = Stream.of("monkey", "gorilla", "bonobo");
		Stream<List<String>> st = Stream.of(zeroo, onee, twoo);
		
		
		Stream<Stream<String>> st2 = st.map(m -> m.stream());
		Stream<String> st3 = st.flatMap(m -> m.stream());
		st2.forEach(System.out::println);
//		st.map(m -> m.stream()).forEach(System.out::println);
		
		
		// flatMap()
		System.out.println("flatMap:");
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla","Baby Gorilla");
		
		Stream<List<String>> animals = Stream.of(zero, one, two);
		Stream<String> a = animals.flatMap(m -> m.stream());
		a.forEach(System.out::println);
		
		// sorted()
		System.out.println("sorted:");
		Stream<String> sor = Stream.of("brown-","bear-");
		sor.sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		// peek()
		System.out.println("peek:");
		Stream<String> p = Stream.of("black bear","brown bear","grizzly");
		long count = p.filter(x -> x.startsWith("g")).peek(System.out::println).count();
		System.out.println(count);
	}

}
