package stream;

import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Statistics {
	private static int max(IntStream ints) {
		OptionalInt optional = ints.max();
		return optional.orElseThrow(RuntimeException::new);
	}
	
	public static int range(IntStream ints) {
		IntSummaryStatistics stats = ints.summaryStatistics();
		if(stats.getCount() == 0) throw new RuntimeException();
		return stats.getMax() - stats.getMin();
	}
	
	public static void main(String[] args) {
		IntStream i = IntStream.rangeClosed(1, 5);
		System.out.println(max(i));
		
		IntStream x = IntStream.rangeClosed(1, 5);
		System.out.println(range(x));
	}
}
