package chaining_optionals;

import java.util.Optional;

public class ChainingOptionals {
	private static void threeDigit(Optional<Integer> optional) {
		optional.map(n -> "" + n)
			.filter(s -> s.length() == 3)
			.ifPresent(System.out::println);
	}
	
	static Optional<Integer> calculator(String s) {
		return Optional.of(s.length());
	}
	
	public static void main(String[] args) {
		Optional<Integer> op1 = Optional.of(123);
		Optional<Integer> op2 = Optional.empty();
		Optional<Integer> op3 = Optional.of(3);
		threeDigit(op1);
		threeDigit(op2);
		threeDigit(op3);
		
		Optional<String> txt = Optional.of("Hola");
		Optional<Integer> try1 = txt.map(String::length);
		Optional<Integer> try2 = txt.flatMap(ChainingOptionals::calculator);
		
	}

}
