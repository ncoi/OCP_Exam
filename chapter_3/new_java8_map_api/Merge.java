package new_java8_map_api;

import java.util.*;
import java.util.function.BiFunction;

public class Merge {

	public static void main(String[] args) {
		BiFunction<String, String, String> mapper = (v1, v2) ->
			v1.length() > v2.length() ? v1 : v2;
			
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
