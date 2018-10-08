package collector;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("rat","mouse","fox");
		Map<Integer,List<String>> map = stream.collect(
				Collectors.groupingBy(String::length));
		System.out.println(map);
		
//		Map<Integer,Set<String>> set = stream.collect(
//				Collectors.groupingBy(
//						String::length,
//						Collectors.toSet()));
		
		TreeMap<Integer,Set<String>> treeSet = stream.collect(
				Collectors.groupingBy(
						String::length,
						TreeMap::new,
						Collectors.toSet()));
		System.out.println(treeSet); // {3=[rat, fox], 5=[mouse]}
		System.out.println(treeSet.getClass()); // HashMap
		
		
		Stream<String> str = Stream.of("lion","fox","tiger","dog");
		Map<Integer,Long> res = str.collect(
				Collectors.groupingBy(
						String::length,
						Collectors.counting()
						));
		System.out.println(res);
	}

}
