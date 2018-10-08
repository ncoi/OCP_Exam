package executor_service;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadTest {

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println("begin");
			service.execute(() -> System.out.println("Printing inventory"));
			service.execute(() -> {
				for(int i = 1; i <= 3; i++)
					System.out.println("Printing record: " + i);
			});
			service.execute(() -> System.out.println("Printing more inventory"));
			System.out.println("end");
		} finally {
			if(service != null) {
				List<Runnable> list = service.shutdownNow();
				list.forEach(System.out::println);
			}
			System.out.println("Shutdown: " + service.isShutdown() + ", Terminated: " + service.isTerminated());
		}
	}

}
