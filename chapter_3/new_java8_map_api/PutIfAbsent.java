package new_java8_map_api;

import java.util.*;

public class PutIfAbsent {
	public static void main(String[] args) {
		Map<String,String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", null);
		
		favorites.putIfAbsent("Jenny", "Tram");
		favorites.putIfAbsent("Sam", "Tram");
		favorites.putIfAbsent("Tom", "Tram");
		System.out.println(favorites);
	}
}
