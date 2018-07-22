package lower_bounder_wildcards;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LowerBounderWildcard {
	
	public static void addSound(List<? super String> list) {
		list.add(new String("hola"));
	}
	
	public static void serialList(List<Serializable> list) {
		
	}
	
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("tweet");
		
		List<Object> objects = new ArrayList<Object>(strings);
		
		List<Serializable> serial = new ArrayList<Serializable>();
		serial.add(new String());
		
		List<Number> numbers = new ArrayList<Number>();
		
		serialList(serial);
//		serialList(strings); // COMPILE ERROR: doesn't match
		addSound(strings);
		addSound(objects);
		addSound(serial);
//		addSound(numbers); // COMPILE ERROR
		
		Serializable s1 = new String("hola");
		Object s2 = new String("hola");
		String s3 = new String("hola");
		
		
		System.out.println(serial.get(0).getClass());
		
	}
}
