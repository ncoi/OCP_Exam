package functionalinterface;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {
	public static void main(String[] args) {
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = s -> s.toUpperCase();
		
		System.out.println(u1.apply("string"));
		System.out.println(u2.apply("hola"));
		
		BinaryOperator<String> b1 = String::concat;
		BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
		
		System.out.println(b1.apply("hello ", "there"));
		System.out.println(b2.apply("general ", "kenobi"));
	}
}
