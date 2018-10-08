package callable_and_supplier;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class CallableSupplier {
	public static void useCallable(Callable<Integer> expression) {}
	public static void useSupplier(Supplier<Integer> expression) throws Exception {}
	public static void use(Supplier<Integer> expression) {}
	public static void use(Callable<Integer> expression) {}

	public static void main(String[] args) {
		useCallable(() -> {return 1;});
//		useSupplier(() -> {throw new Exception();});  DOES NOT COMPILE
//		use(() -> {throw new Exception();}); DOES NOT COMPILE, AMBIGUOUS
		use((Callable<Integer>)() -> {throw new Exception();}); // COMPILES
	}

}
