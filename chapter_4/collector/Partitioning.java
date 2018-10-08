package collector;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Partitioning {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("lions","tigers","jaguars","bears");
		Map<Boolean, TreeMap<Integer,String>> map = stream.collect(
				Collectors.partitioningBy(
						s -> s.length() < 6,
						Collectors.toMap(
								String::length,
								Function.identity(),
								(s1, s2) -> s1 + "," + s2,
								TreeMap::new)));
		System.out.println(map); // {false=[tigers, jaguars], true=[lions]}
	}

}
