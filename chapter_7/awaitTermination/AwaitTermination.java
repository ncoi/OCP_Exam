package awaitTermination;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTermination {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			List<Callable<Integer>> list = Arrays.asList(
					() -> {
						System.out.println("Returning 20");
						return 20;
					},
					() -> {
						System.out.println("Returning 30");
						return 30;
					},
					() -> {
						System.out.println("Returning 60");
						return 60;
					});
			service.invokeAll(list);
		} finally {
			if(service != null) service.shutdown();
		}
		if(service != null) {
			service.awaitTermination(1, TimeUnit.NANOSECONDS);
			// Check whether all tasks are finished
			if(service.isTerminated())
				System.out.println("All tasks finished");
			else
				System.out.println("At least one task is still running");
		}

	}

}
