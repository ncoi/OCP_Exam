package generics;

import java.util.ArrayList;
import java.util.List;

public class GenTest {
	static void printName(List<String> list) {
		for(int i = 0; i < list.size(); i++) {
			String name = (String)list.get(i);
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add(new String("Hola"));
		printName(list);
	}
}
