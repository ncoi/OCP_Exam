package new_java8_map_api;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ComputeIf {
	public static void main(String[] args) {
		BiFunction<String, Integer, Integer> f = (k,v) -> v + 1;
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Jenny", 1);
		map.put("Sam", null);
		
		map.computeIfPresent("Jenny", f); // 2
		map.computeIfPresent("Sam", f);  // null
		
		System.out.println(map); // {Jenny=2}
		
		// @param <T> the type of the input to the function
		// @param <R> the type of the result of the function
		Function<String, Integer> mapper2 = k -> 1;
		map.put("Tom", null);
		map.put("Jenny", 15);
		
		map.computeIfAbsent("Jenny", mapper2); // 15
		map.computeIfAbsent("Tom", mapper2);  // 1
		map.computeIfAbsent("Sam", mapper2);  // 1
		
		System.out.println(map);
	}
}
