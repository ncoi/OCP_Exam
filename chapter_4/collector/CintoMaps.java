package collector;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CintoMaps {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("penguin","bear","bird");
		Map<String, Integer> map = stream.collect(
				Collectors.toMap(x -> x, String::length));
		System.out.println(map); // {bird=4, bear=4, penguin=7}
		
		Stream<String> stream2 = Stream.of("penguin","bear","bird");
		TreeMap<Integer,String> map2 = stream2.collect(
				Collectors.toMap(
						String::length,
						Function.identity(),
						(s1,s2) -> s1 + "," + s2,
						TreeMap::new));
		System.out.println(map2); // {4=bear,bird, 7=penguin}
		System.out.println(map2.getClass()); // TreeMap

	}

}
