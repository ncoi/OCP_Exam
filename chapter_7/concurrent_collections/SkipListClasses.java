package concurrent_collections;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class SkipListClasses {

	public static void main(String[] args) {
		Set<Integer> set = new ConcurrentSkipListSet<>();
		set.add(88);
		set.add(3);
		set.add(65);
		set.add(32);
		System.out.println(set);
		
		Map<Integer, String> map = new ConcurrentSkipListMap<>();
		map.put(88, " there ");
		map.put(1, "general ");
		map.put(54, " hello ");
		map.put(2, " kenobi ");
		System.out.println(map);
	}

}
