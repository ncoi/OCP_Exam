package scheduledexecturoservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SES {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ScheduledExecutorService service = null;
		try {
			service = Executors.newSingleThreadScheduledExecutor();
			Runnable task1 = () -> System.out.println("Task 1");
			Callable<String> task2 = () -> "Task2";
			
			ScheduledFuture<?> res1 = service.schedule(task1, 1, TimeUnit.SECONDS);
			ScheduledFuture<?> res2 = service.schedule(task2, 1, TimeUnit.SECONDS);
			System.out.println("Res 1 Value: " + res1.get());
			System.out.println("Res 2 Value: " + res2.get());
			System.out.println("Remainig Delay 1: " + res1.getDelay(TimeUnit.SECONDS));
			System.out.println("Remaining Delay 2: " + res2.getDelay(TimeUnit.SECONDS));
		} finally {
			if(service != null) service.shutdown();
		}
	}
}
