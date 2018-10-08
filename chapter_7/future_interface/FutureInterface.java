package future_interface;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureInterface {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Future<?> result = service.submit(() -> System.out.println("Future Interface"));
			result.cancel(true);
			System.out.println("isDone: " + result.isDone());
			System.out.println("isCancelled: " + result.isCancelled());
			System.out.println(result.get(10, TimeUnit.SECONDS));
		} catch(TimeoutException e) {
			System.out.println("Not reached in time");
		}
		finally {
			if(service != null) service.shutdown();
		}
	}

}
