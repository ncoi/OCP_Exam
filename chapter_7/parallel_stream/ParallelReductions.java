package parallel_stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelReductions {

	public static void main(String[] args) {
		Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream();
		Stream<Integer> parallelStream = Arrays.asList(1,2,3,4,5,6,7,8,9,10).parallelStream();
		
		System.out.println(stream.skip(5).limit(2).findFirst().get());
		System.out.println(parallelStream.skip(5).limit(2).findFirst().get());
	}

}
