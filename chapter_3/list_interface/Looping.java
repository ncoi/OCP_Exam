package list_interface;

import java.util.*;

public class Looping {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>(Arrays.asList("H", "O", "L", "A"));
		
		// Before Java 5
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			String value = (String) iter.next();
			System.out.println(value);
		}
		
		Iterator<String> iter2 = list.iterator();
		while(iter2.hasNext()) {
			String value2 = iter2.next();
			System.out.println(value2);
		}
	}
}
