package scheduledexecturoservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SESFixed {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ScheduledExecutorService service = null;
		try {
			service = Executors.newSingleThreadScheduledExecutor();
			Runnable task1 = () -> System.out.println("Task 1");
			Runnable task2 = () -> System.out.println("Task 2");
			ScheduledFuture<?> res = service.scheduleAtFixedRate(task1, 2, 2, TimeUnit.SECONDS);
			service.scheduleWithFixedDelay(task2, 2, 2, TimeUnit.SECONDS);
			System.out.println(res.get());
		} finally {
			if(service != null) service.shutdown();
		}
	}

}
