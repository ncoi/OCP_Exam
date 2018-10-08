package parallel_stream;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelGroupingBy {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("lions", "tigers", "bears").parallel();
		ConcurrentMap<Integer, Set<String>> map = stream.collect(
				Collectors.groupingByConcurrent(
						String::length,
						Collectors.toSet()));
		System.out.println(map);
	}

}
