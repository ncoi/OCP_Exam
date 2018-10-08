package parallel_stream;

import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelCollect {

	public static void main(String[] args) {
		Stream<String> stream = Arrays.asList("w","o","l","f","f").parallelStream();
		SortedSet<String> set = stream.collect(
				ConcurrentSkipListSet::new,
				Set::add,
				Set::addAll);
		System.out.println(set);
	}

}
