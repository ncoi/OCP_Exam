package callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationClass {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Future<Integer> result1 = service.submit(() -> 30 + 11);
			Future<Integer> result2 = service.submit(() -> 30 + 11);
			Future<Integer> result3 = service.submit(() -> 30 + 11);
		} finally {
			if(service != null) service.shutdown();
		}
		if(service != null) {
			service.awaitTermination(1, TimeUnit.MINUTES);    // awaitTermination -> throws InterruptedException
			// Check whether all tasks are finished
			if(service.isTerminated())
				System.out.println("All tasks finished");
			else
				System.out.println("At least one task is still running");
		}
	}

}
