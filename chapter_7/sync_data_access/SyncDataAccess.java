package sync_data_access;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SyncDataAccess {
	private int sheepCount = 0;
	private void incrementAndReport() {
		synchronized(this) {
			System.out.print((++sheepCount)+" ");
		}
	}
	
	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			SyncDataAccess manager = new SyncDataAccess();
			for(int i=0; i<10; i++)
				service.submit(() -> manager.incrementAndReport());
		} finally {
			if(service != null) service.shutdown();
		}
	}

}
