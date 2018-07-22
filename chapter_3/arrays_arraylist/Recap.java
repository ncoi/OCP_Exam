package arrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recap {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();   // empty list
		list.add("Hola");
		list.add("Chao");
		
		String [] array = new String[list.size()];  // empty array of length 2
		array[0] = list.get(1);
		array[1] = list.get(0);
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "-");
		}
		
		
		// Link created when converting between an array and ArrayList
		String [] array1 = {"gerbil", "mouse"};
		List<String> list1 = Arrays.asList(array1);
		list1.set(1, "test");           // [gerbil, test]
		array1[0] = "new";              // [new, test]
		
		System.out.println(list1.toString());
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "-");
		}
		
		String [] array2 = (String[]) list1.toArray();
		
		list1.remove(0);
	}

}
