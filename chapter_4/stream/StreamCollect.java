package stream;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {

	public static void main(String[] args) {
		Stream<String> col = Stream.of("w","o","l","f");
		StringBuilder cword = col.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(cword);
		
		Stream<String> setStream = Stream.of("w","o","l","f");
		TreeSet<String> set = setStream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		System.out.println(set);
		
		Stream<String> wolf = Stream.of("w","o","l","f");
		TreeSet<String> wolfSet = wolf.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(wolfSet); // [f,l,o,w]
		
		Stream<String> wolff = Stream.of("w","o","l","f");
		Set<String> wolffSet = wolff.collect(Collectors.toSet()); // unordered Collector
		System.out.println(wolffSet);
	}

}
