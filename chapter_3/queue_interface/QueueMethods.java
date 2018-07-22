package queue_interface;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMethods {

	public static void main(String[] args) {
		// FIFO (single-ended queue)
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(10));   // true
		System.out.println(queue.offer(11));   // true
		System.out.println(queue.element());   // true
		System.out.println(queue.offer(12));    // true
		System.out.println(queue);             // [10,11,12]
		System.out.println(queue);             // [10,11,12]
		System.out.println(queue.peek());      // 10
		System.out.println(queue.poll());      // 10
		System.out.println(queue.poll());      // 11
		System.out.println(queue.poll());      // 12
//		System.out.println(queue.remove());    // Exception in thread "main" java.util.NoSuchElementException
		
		
		// LIFO (stack)
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		deque.push(10);                      // 10
		deque.push(4);                       // 4
		System.out.println(deque.peek());    // 10
		System.out.println(deque);           // [4,10]
		System.out.println(deque.peek());    // 4
		System.out.println(deque.poll());    // 4
		System.out.println(deque.poll());    // 10
		System.out.println(deque.peek());    // null
 	}

}
