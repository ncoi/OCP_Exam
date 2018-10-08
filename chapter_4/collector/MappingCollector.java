package collector;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.minBy;

public class MappingCollector {

	public static void main(String[] args) {
		Stream<String> str = Stream.of("lions","tigers","penguins","cats","dogs");
		Map<Integer,Optional<Character>> map = str.collect(
				Collectors.groupingBy(
						String::length,
						mapping(
								s -> s.charAt(0),
								minBy(Comparator.naturalOrder()))));
		// {4=Optional[c], 5=Optional[l], 6=Optional[t], 8=Optional[p]}
		System.out.println(map);
		
		Optional<String> opt = Optional.empty();
		System.out.println(opt.get());
	}

}
