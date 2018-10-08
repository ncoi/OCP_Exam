package concurrent_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollections {

	public static void main(String[] args) {
		List<Integer> list = Collections.synchronizedList(
				new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)));
		
		synchronized(list) {
			for(int data : list) {
				System.out.println(data + " ");
				list.remove(data);
			}
		}
		

	}

}
