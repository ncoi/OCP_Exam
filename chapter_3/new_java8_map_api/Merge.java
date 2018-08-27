package new_java8_map_api;

import java.util.*;
import java.util.function.BiFunction;

public class Merge {

	public static void main(String[] args) {
		// @param <T> the type of the first argument to the function
		// @param <U> the type of the second argument to the function
		// @param <R> the type of the result of the function
		// @FunctionalInterface
		BiFunction<String, String, String> mapper = (v1, v2) -> {
			System.out.println("Param 1: " + v1 + " Param 2: " + v2);
			return v1.length() > v2.length() ? v1 : v2;
		};
			
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", null);
		favorites.merge("Sam", "Skyride", mapper);
		
		String jenny = favorites.merge("Jenny", "Skyride", mapper);
		String tom = favorites.merge("Tom", "Skyride", mapper);
		
		System.out.println(favorites);
		System.out.println(jenny);
		System.out.println(tom);
	}

}
