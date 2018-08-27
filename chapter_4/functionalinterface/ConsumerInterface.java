package functionalinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerInterface {
	public static void main(String[] args) {
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = y -> System.out.println(y);
		
		c1.accept("Hello");
		c2.accept("There");
		
		Map<String, String> map = new HashMap<>();
		BiConsumer<String, String> b1 = map::put;
		BiConsumer<String, String> b2 = (k, v) -> map.put(k, v);
		
		b1.accept("chicken", "chicken");
		b2.accept("chick", "chick");
		System.out.println(map);
	}
}
