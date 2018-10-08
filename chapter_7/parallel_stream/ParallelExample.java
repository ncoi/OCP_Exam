package parallel_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Stream<Integer> stream = new ArrayList<>(list).stream();
		
//		Stream<Integer> parallelStream1 = stream.parallel();
		
		Stream<Integer> parallelStream2 = list.parallelStream();
		
		
		System.out.println("Stream Parallel?: " + stream.isParallel());
		System.out.println("Parallel Stream Parallel: " + parallelStream2.isParallel());
		parallelStream2.forEach(System.out::println);
	}

}
