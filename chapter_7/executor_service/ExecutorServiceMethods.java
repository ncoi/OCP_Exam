package executor_service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorServiceMethods {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println("start");
			List<Callable<Integer>> list = Arrays.asList(
					() -> 30,
					() -> {
						System.out.println("Returning 20");
						return 20;
					},
					() -> 60);
			
			List<Future<Integer>> result = service.invokeAll(list, 1, TimeUnit.NANOSECONDS); // throws InterruptedException
//			int res = service.invokeAny(list, 1, TimeUnit.SECONDS);
//			System.out.println(res);
//			result.forEach(System.out::println);
			for(Future<Integer> f : result) {
				System.out.println(f.isCancelled());
			}
//			Future<?> resul = service.submit(() -> System.out.println("Done"));
//			System.out.println(resul.get());
			System.out.println("end");
			
		} finally {
			if(service != null) service.shutdown();
		}
	}

}
