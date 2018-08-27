package map_interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

	public static void main(String[] args) {
//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "nelson");
//		map.put(1, "nelson");
//		System.out.println(map);
		
		Map<Object,Object> m = new HashMap<Object,Object>();
		m.put("1", new ArrayList());
		m.put(1, new Object());
		m.put(1.0, "Hello");
		System.out.println(m);
	}

}
