package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateInterface {
	public static void main(String[] args) {
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = s -> s.isEmpty();
		System.out.println(p1.negate().test(""));
		System.out.println(p2.test(""));
		
		BiPredicate<String, String> b1 = String::startsWith;
		BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
		System.out.println(b1.test("aloha", "al"));
		System.out.println(b2.negate().test("hello", "there"));
		
		
		// Predicate default methods
		Predicate<String> egg = s -> s.contains("egg");
		Predicate<String> brown = s -> s.contains("brown");
		
		Predicate<String> brownEggs = egg.and(brown);
		Predicate<String> otherEggs = egg.and(brown.negate());
	}
}
