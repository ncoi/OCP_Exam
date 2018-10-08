package concurrent_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationExc {

	public static void main(String[] args) {
//		Map<String,Object> foodData = new HashMap<>();
		Map<String,Object> foodData = new ConcurrentHashMap<>();
		foodData.put("penguin", 1);
		foodData.put("tomato", 2);
		for(String key : foodData.keySet())
			foodData.remove(key);
	}

}
