package scheduledexecturoservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ScheduledExecutorService service = null;
		try {
			service = Executors.newScheduledThreadPool(2);
			service.scheduleWithFixedDelay(
							() -> System.out.println("task 2"), 2, 2, TimeUnit.SECONDS);
			Thread.sleep(10000);
		} finally {
			if(service != null) service.shutdown();
			System.out.println("isShutdown: " + service.isShutdown());
			System.out.println("isShutdown: " + service.isTerminated());
		}
	}

}
