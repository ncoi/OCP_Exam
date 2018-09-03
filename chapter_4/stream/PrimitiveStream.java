package stream;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Random;

public class PrimitiveStream {

	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(1,2,3,4,5);
		System.out.println(s.mapToInt(x -> x).sum()); // 15
		
		IntStream intStream = IntStream.of(1,2,3,4,5);
		OptionalDouble avg = intStream.average();
		System.out.println(avg.getAsDouble()); // 3.0
		
		// Creating a Primitive Stream
		DoubleStream empty = DoubleStream.empty();
		DoubleStream oneElement = DoubleStream.of(3.14);
		DoubleStream multElement = DoubleStream.of(1.0, 1.1, 2);
		System.out.println(multElement.count());
		
		// Creating Infinite Primitive Stream
		DoubleStream random = DoubleStream.generate(Math::random);
		DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
		random.limit(3).forEach(System.out::println);
		fractions.limit(3).forEach(System.out::println);
		
		Random rnd = new Random();
		IntStream funFact = rnd.ints();
		System.out.println("Random class:");
		funFact.limit(5).forEach(System.out::println);
		
		// Range
		IntStream rng = IntStream.range(1, 6);  // exclusive
		rng.forEach(System.out::println);
		
		IntStream rngClosed = IntStream.rangeClosed(1, 5);
		rngClosed.forEach(System.out::println);
	}

}
