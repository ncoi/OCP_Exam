package optional;

import java.util.Optional;

public class OptionalExample {
	public static Optional<Double> average(int... scores) {
		if(scores.length == 0) return Optional.empty();
		int sum = 0;
		for(int score: scores) sum += score;
		return Optional.of((double) sum / scores.length);
	}
	public static void main(String[] args) throws Throwable {
		System.out.println(average(1,2,3,4,5));
		System.out.println(average());
		
		Optional<Double> opt = average(100,200,300);
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
		
		Optional<Double> empty = average();
//		System.out.println(empty.get()); // java.util.NoSuchElementException: No value present
		
		Optional o1 = Optional.ofNullable("1");
		Optional o2 = Optional.ofNullable(null);
		
		
		o1.ifPresent(v -> System.out.println(v));
		
		System.out.println("Or else: " + o2.orElse("hola"));
		System.out.println("Or else: " + o1.orElse("hola"));
		
		System.out.println(o1);
		System.out.println(o2);
		
		
		System.out.println(o2.orElse(Double.NaN));
		System.out.println(o2.orElseGet(() -> Math.random()));
		System.out.println(o2.orElseThrow(() -> new IllegalStateException()));
	}
}
