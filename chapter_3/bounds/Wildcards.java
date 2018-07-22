package bounds;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
	public static void printList(List<?> list) {
		for (Object o : list) System.out.println(o);
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hola");
		printList(list);
	}
}
