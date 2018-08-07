package compute;

import java.util.*;
import java.util.function.Function;

public class ComputeIfAbsent {
	public static void main(String[] args) {
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 15);
		counts.put("Tom", null);
		
		System.out.println(counts); // {Tom=null, Jenny=15}
		
		Function<String, Integer> mapper = k -> 1;
		Integer jenny = counts.computeIfAbsent("Jenny", mapper);
		Integer sam = counts.computeIfAbsent("Sam", mapper);
		Integer tom = counts.computeIfAbsent("Tom", mapper);
		
		System.out.println(counts);
	}
}
