package scheduling_tasks;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorS {

	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		
		Runnable task1 = () -> System.out.println("Hello Zoo");
		Callable<String> task2 = () -> "Monkey";
		
		ScheduledFuture<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
		Future<?> result11 = service.schedule(task1, 10, TimeUnit.SECONDS);
		
		ScheduledFuture<?> result2 = service.schedule(task2, 8, TimeUnit.MINUTES);
		Future<?> result22 = service.schedule(task2, 8, TimeUnit.MINUTES);
		
		System.out.println("Delay task 1: " + result1.getDelay(TimeUnit.SECONDS));
		System.out.println("Delay task 2: " + result2.getDelay(TimeUnit.MINUTES));
		
//		service.scheduleAtFixedDelay(task1, 0, 2, TimeUnit.SECONDS); // ????
		service.scheduleWithFixedDelay(task1, 0, 2, TimeUnit.SECONDS); // 
	}

}
