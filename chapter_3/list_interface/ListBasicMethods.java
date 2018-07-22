package list_interface;

import java.util.ArrayList;
import java.util.List;

public class ListBasicMethods {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("SD");     // [SD]
		list.add(0, "NY");  // [NY, SD]
		list.set(1, "FL");  // [NY, FL]
		list.remove("NY");  // [FL]
		list.remove(0);     // []
		
		list.add("OH");
		list.add("CO");
		list.add("CO");
		list.add("CO");
		String v = list.get(1);
		int index = list.lastIndexOf("CO");
		
		System.out.println("Last Index of " + v + ": " + index);
 	}

}
