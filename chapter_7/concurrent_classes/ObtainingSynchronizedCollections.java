package concurrent_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObtainingSynchronizedCollections {

	public static void main(String[] args) {
		List<Integer> list = Collections.synchronizedList(
				new ArrayList<>(Arrays.asList(4,3,32)));
		synchronized(list) {
			for(int data: list) {
				System.out.println(data+" ");
			}
		}
		
		
		Map<String, Object> foodData = new HashMap<>();
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		Map<String, Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
		for(String key: synchronizedFoodData.keySet()) {
			synchronizedFoodData.remove(key);  // throws ConcurrentModificationException
		}
	}

}
