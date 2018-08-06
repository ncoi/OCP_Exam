package new_java8_map_api;

import java.util.HashMap;
import java.util.Map;

public class NewMap {

	public static void main(String[] args) {
		Map<String, String> favorites = new HashMap<>();
		favorites.putIfAbsent("Jenny", "Bus Tour");
		favorites.putIfAbsent("Jenny", "Tram");
		favorites.putIfAbsent("Tom", null);
		favorites.putIfAbsent("Tom", "Car");
		System.out.println(favorites);
	}

}
