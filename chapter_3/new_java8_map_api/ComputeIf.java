package new_java8_map_api;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ComputeIf {
	public static void main(String[] args) {
		BiFunction<String, Integer, Integer> f = (k,v) -> v + 1;
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Jenny", 1);
		
		map.computeIfPresent("Jenny", f);
		
		System.out.println(map);
		
		
		Function<String, Integer> mapper2 = k -> 1;
		map.put("Tom", null);
		map.put("Jenny", 15);
		
		map.computeIfAbsent("Jenny", mapper2);
		map.computeIfAbsent("Tom", mapper2);
		map.computeIfAbsent("Sam", mapper2);
		
		System.out.println(map);
	}
}
