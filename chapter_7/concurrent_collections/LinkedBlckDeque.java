package concurrent_collections;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class LinkedBlckDeque {

	public static void main(String[] args) {
		try {
			 BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
			 blockingDeque.offerFirst(1, 2, TimeUnit.MINUTES);
			 blockingDeque.offerLast(43, 2, TimeUnit.SECONDS);
			 blockingDeque.offer(3, 4, TimeUnit.SECONDS);
			 
			 System.out.println(blockingDeque.poll());                                  // 1
			 System.out.println(blockingDeque.poll(950, TimeUnit.MILLISECONDS));        // 43
			 System.out.println(blockingDeque.pollFirst(200, TimeUnit.NANOSECONDS));    // 3
			 System.out.println(blockingDeque.pollLast(1, TimeUnit.SECONDS));           // null
		} catch(InterruptedException e) {
			System.out.println(e);
		}
	}

}
