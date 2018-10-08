package questions;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question14 {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1);
		IntStream is = s.mapToInt(x -> x);
		DoubleStream ds = s.mapToDouble(x -> x);
		// IntStream s2 = ds.mapToInt(x -> x); // cannot convert from double to int without casting
		// s2.forEach(System.out::print);
	}

}
