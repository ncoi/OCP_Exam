package collector;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingCollectors {

	public static void main(String[] args) {
		Comparator<String> comp = (s1, s2) -> s1.length() - s2.length();
		Stream<String> st1 = Stream.of("lion","zebra","monkey");
		Optional<String> res1 = st1.collect(Collectors.maxBy(comp));
		System.out.println(res1.get());
		
		Stream<String> st2 = Stream.of("lion","zebra","monkey");
//		Double res2 = st2.collect(Collectors.averagingInt(String::length));
		IntSummaryStatistics res2 = st2.collect(Collectors.summarizingInt(String::length));
		System.out.println(res2); // 5.0
		
		
		Stream<String> toSet = Stream.of("alemania","colombia","brazil");
		List<String> tSet = toSet
				.filter(s -> s.startsWith("b"))
				.collect(Collectors.toList());
		System.out.println(tSet);
	}

}
