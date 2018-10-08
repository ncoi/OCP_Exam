package questions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.DoubleStream;

public class Question16_7 {
	public static <T> Future<T> hola(Future<T> a) {
		return a;
	}
	
	public static int hola2() {
		return 1;
	}
	
	public static void main(String[] args) {
		Future<String> f = null;
		ExecutorService service = Executors.newScheduledThreadPool(10);
		DoubleStream.of(3.14159,2.71828)
//			.forEach(c -> service.submit(() -> System.out.println(10*c)));
			.forEach((a) -> hola2());
		service.execute(() -> System.out.println("Printed")); // b4
	}
}
