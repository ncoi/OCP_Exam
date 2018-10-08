package concurrent_collections;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class LinkedBlckQueue {

	public static void main(String[] args) {
		try {
			BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
			blockingQueue.offer(39);
			blockingQueue.offer(40, 4, TimeUnit.SECONDS); // new method
			
			System.out.println(blockingQueue.poll()); // 39
			System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		
	}

}
