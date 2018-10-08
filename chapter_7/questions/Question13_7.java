package questions;

import java.util.stream.Stream;

public class Question13_7 {

	public static void main(String[] args) {
		Stream<String> cats = Stream.of("leopard","lynx","ocelot","puma").parallel();
		Stream<String> bears = Stream.of("panda","grizzly","polar").parallel();
//		Stream<Stream<String>> stream = Stream.of(cats,bears);
	
		Stream<String> stream = Stream.concat(cats,bears);
		
		System.out.println("Cats: " + cats.isParallel());
		System.out.println("Stream: " + stream.isParallel());
		
	}

}
