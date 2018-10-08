package synchronizing_data_access;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BadSheepManager {
	private int sheepCount = 0;
	private void incrementAndReport() {
		System.out.println((++sheepCount) + "");
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			BadSheepManager bsm = new BadSheepManager();
			for(int i = 1; i <= 10; i++)
				service.submit(() -> bsm.incrementAndReport());
		} finally {
			if(service != null) service.shutdown();
		}
	}

}
