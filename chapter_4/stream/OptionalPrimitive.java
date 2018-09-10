package stream;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class OptionalPrimitive {
	public static void main(String[] args) {
//		IntStream rng = IntStream.rangeClosed(1, 10);
//		OptionalDouble op = rng.average();
//		
//		op.ifPresent(System.out::println);
//		System.out.println(op.getAsDouble());
//		System.out.println(op.orElseGet(() -> Double.NaN));
//		
//		
//		LongStream longs = LongStream.of(5,10);
//		long sum = longs.sum();
//		System.out.println(sum);
//		
//		DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
//		OptionalDouble min = doubles.min();
		
//		Stream<Integer> r = Stream.of(1,2,3,4,5);
//		r.filter(m -> m instanceof Number)
//		.peek(System.out::println)
//		.sorted()
//		.forEach(System.out::println);
		
		
		Duration d = Duration.between(LocalDateTime.of(2015, Month.SEPTEMBER, 2, 1, 0), LocalDateTime.of(2015, Month.SEPTEMBER, 2, 0, 30));
		System.out.println(d);
	}
}
