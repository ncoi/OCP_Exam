package looping_collection;

import java.util.Arrays;
import java.util.List;

public class LoopingCollection {
	public static void main(String[] args) {
		List<String> cats = Arrays.asList("Felix", "Garfield");
//		for(String cat : cats)
//			System.out.println(cat);
		
//		cats.forEach(c -> System.out.println(c));
		
		cats.forEach(System.out::println);
	}
}
