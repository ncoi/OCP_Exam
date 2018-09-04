package stream;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class OptionalPrimitive {
	public static void main(String[] args) {
		IntStream rng = IntStream.rangeClosed(1, 10);
		OptionalDouble op = rng.average();
		
		op.ifPresent(System.out::println);
		System.out.println(op.getAsDouble());
		System.out.println(op.orElseGet(() -> Double.NaN));
		
		
		LongStream longs = LongStream.of(5,10);
		long sum = longs.sum();
		System.out.println(sum);
		
		DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
		OptionalDouble min = doubles.min();
	}
}
