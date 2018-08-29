package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TerminalOperations {
	public static void main(String[] args) {
		// count()
		Stream<String> s1 = Stream.of("monkey","gorilla","bonobo");
		System.out.println(s1.count());
		
		// min() max()
		Stream<String> s2 = Stream.of("xbd","ape","vcd");
		Optional<String> min = s2.min((x, y) -> x.length() - y.length());
		min.ifPresent(System.out::println);
		
		Optional<?> minEmpty = Stream.empty().min((x, y) -> 0);
		System.out.println(minEmpty.isPresent());
		
		// findAny() findFirst()
		Stream<String> animal = Stream.of("monkey", "gorilla", "bonobo");
		Stream<String> infinite = Stream.generate(() -> "chimp");
		animal.findAny().ifPresent(System.out::println);
		infinite.findAny().ifPresent(System.out::println);
		
		// allMatch() anyMatch() noneMatch()
		List<String> list = Arrays.asList("monkey", "2", "chimp");
		Stream<String> inf = Stream.generate(() -> "chimp");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		System.out.println(list.stream().anyMatch(pred));
		System.out.println(list.stream().allMatch(pred));
		System.out.println(list.stream().noneMatch(pred));
		System.out.println(inf.anyMatch(pred));
		
		// forEach()
		Stream<String> anim = Stream.of("Monkey","Gorilla","Bonobo");
		anim.forEach(System.out::println);
		
		
		// reduce()
//		Stream<String> str = Stream.of("w","o","l","f");
		Stream<String> str = Stream.empty();
//		String word = str.reduce("", (s, c) -> s + c);
		String word = str.reduce("default", String::concat);
		System.out.println(word);
		
		Stream<Integer> integer = Stream.of(1,2,3,4,5,6);
//		Integer result = integer.reduce(1, (x,y) -> x*y);
		Integer result = integer.reduce(1, Math::multiplyExact);
		System.out.println(result);
		
		BinaryOperator<Integer> op = (a, b) -> a * b;
		Stream<Integer> emptyR = Stream.empty();
		Stream<Integer> oneElement = Stream.of(1);
		Stream<Integer> threeElements = Stream.of(1,2,3);
		
		emptyR.reduce(op).ifPresent(System.out::println);
		oneElement.reduce(op).ifPresent(System.out::println);
		threeElements.reduce(op).ifPresent(System.out::println);
		
		BinaryOperator<Integer> oper = (a, b) -> a * b;
		Stream<Integer> stre = Stream.of(3,5,6);
		System.out.println(stre.reduce(1, oper, oper)); // 90
	}
}
