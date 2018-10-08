package parallel_stream;

import java.util.ArrayList;
import java.util.List;

public class PerformanceTest {
	public int processRecord(int input) {
		try {
			Thread.sleep(10);
		} catch(InterruptedException e) {
			
		}
		return input + 1;
	}
	
	public void processAllData(List<Integer> data) {
		data.parallelStream().map(a -> processRecord(a)).count();
	}
	
	public static void main(String[] args) {
		PerformanceTest test = new PerformanceTest();
		
		// Define data
		List<Integer> data = new ArrayList<>();
		for(int i = 0; i <= 4000; i++) data.add(i);
		
		// Process the data
		long start = System.currentTimeMillis();
		test.processAllData(data);
		double time = (System.currentTimeMillis()-start)/1000.0;
		
		// Report results
		System.out.println("\nTask completed in: " + time + " seconds");
	}

}
