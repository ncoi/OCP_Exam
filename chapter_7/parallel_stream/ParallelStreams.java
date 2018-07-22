package parallel_stream;

import java.util.Arrays;

public class ParallelStreams {

	public static void main(String[] args) {
		Arrays.asList(1,2,3,4,5)
			.stream()
			.forEach(s -> System.out.println(s+" "));
		
		Arrays.asList(1,2,3,4,5)
		.parallelStream()
		.forEach(s -> System.out.println(s+" "));
		
		Arrays.asList(1,2,3,4,5)
		.parallelStream()
		.forEachOrdered(s -> System.out.println(s+" "));
	}

}
