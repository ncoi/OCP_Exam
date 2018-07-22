package concurrent_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollection {

	public static void main(String[] args) {
		Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		for(String key: foodData.keySet())
			foodData.remove(key);
	}

}
