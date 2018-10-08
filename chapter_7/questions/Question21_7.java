package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class Question21_7 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newSingleThreadExecutor();
		final List<Future<?>> results = new ArrayList<>();
		Future<?> f = service.submit(() -> {
			System.out.println("hola miguel");
			throw new RuntimeException();
		});
		System.out.println(f.get());
		service.shutdown();
	}

}
