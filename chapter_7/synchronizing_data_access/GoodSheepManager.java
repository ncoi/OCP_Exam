package synchronizing_data_access;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class GoodSheepManager {
//	private AtomicInteger sheepCount = new AtomicInteger(); // NEW WITH VALUE OF 0
	private int sheepCount = 0;	
	private void incrementAndReport() {
		synchronized(this) {
			System.out.println(++sheepCount);
		}
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			GoodSheepManager gdm = new GoodSheepManager();
			for(int i = 1; i <= 10; i++)
				service.submit(() -> gdm.incrementAndReport());
		} finally {
			if(service != null) service.shutdown();
		}

	}

}
