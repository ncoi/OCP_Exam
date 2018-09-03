package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSources {
	public static void main(String[] args) {
		Stream<String> empty = Stream.empty();         // count = 0
		Stream<Integer> singleElement = Stream.of();  // count = 0
		Stream<Integer> fromArray = Stream.of(1,2,3);  // count = 3
		System.out.println(singleElement.count());
		
		// convert from a list to a stream
		List<String> list = Arrays.asList("a","b","c");
		Stream<String> fromList = list.stream();
		Stream<String> fromListParallel = list.parallelStream();
		
		// infinite stream
		Stream<Double> randoms = Stream.generate(Math::random);
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
	}
}
