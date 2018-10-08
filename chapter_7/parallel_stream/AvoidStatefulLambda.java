package parallel_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AvoidStatefulLambda {

	public static void main(String[] args) {
		List<Integer> data = Collections.synchronizedList(new ArrayList<>());
		Arrays.asList(1,2,3,4,5,6).parallelStream()
			.map(i -> { data.add(i); return i; })
			.forEachOrdered(System.out::print);
		System.out.println();
		for(Integer i : data) {
			System.out.print(i);
		}
	}

}
