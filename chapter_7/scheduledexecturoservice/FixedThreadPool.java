package scheduledexecturoservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(2);
			Runnable r1 = () -> {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("task 1");
			};
			Runnable r2 = () -> System.out.println("task 2");
			Runnable r3 = () -> System.out.println("task 3");
			Runnable r4 = () -> {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("task 4");
			};
			service.execute(r1);
			service.execute(r2);
			service.execute(r3);
			service.execute(r4);
		} finally {
			if(service != null) service.shutdown();
		}
	}

}
