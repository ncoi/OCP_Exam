package parallel_stream;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelCollectOneParam {

	public static void main(String[] args) {
		Stream<String> str = Arrays.asList("w","o","l","f").parallelStream();
		ConcurrentMap<Integer, String> map = str.collect(Collectors.toConcurrentMap(
				String::length,
				x -> x,
				(s1, s2) -> s1 + " , " + s2));
		System.out.println(map.getClass()); // java.util.concurrent.ConcurrentHashMap

	}

}
