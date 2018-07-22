package waiting_for_results;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CheckResults {
	private static int counter = 0;
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Future<?> result = service.submit(() -> {
				for(int i=0; i<1000000; i++) CheckResults.counter++;
			});
			result.get(10, TimeUnit.MILLISECONDS);   // InterruptedException, ExecutionException 
			System.out.println("Reached!");
		}  catch(TimeoutException e) {
			System.out.println("Not reached in time!");
			throw e;
		}
		finally {
			if(service != null) service.shutdown();
		}

	}

}
