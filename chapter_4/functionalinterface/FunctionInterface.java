package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterface {
	public static void main(String[] args) {
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = s -> s.length();
		
		System.out.println(f1.apply("hola"));
		System.out.println(f2.apply("adios"));
		
		BiFunction<String,String,String> b1 = String::concat; 
		// the first parameter is the instance that concat() is called on and
		// the second is passed to concat().
		BiFunction<String,String,String> b2 = (string, toAdd) -> string.concat(toAdd);
		
		System.out.println(b1.apply("hello ", "there"));
		System.out.println(b2.apply("general ", "kenobi"));
	}
}
