package generic_methods;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
	public static <T> T ship(T t) {
		return t;
	}
	
	public <T> T greet(T t) {
		return t;
	}
	
	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		System.out.println(gm.greet(new Integer(5)));
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		
		int i = list.get(0);
	}
	
}
