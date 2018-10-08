package callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println("start");
			Future<Integer> result = service.submit(() -> { 
				Thread.sleep(1000);
				return (30 + 10);
			});
//			System.out.println(result.get()); // BLOCKS EXECUTION
			System.out.println("end");
		} finally {
			if(service != null) service.shutdown();
		}
	}
}
