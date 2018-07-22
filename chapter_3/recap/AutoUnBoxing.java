package recap;

import java.util.ArrayList;
import java.util.List;

public class AutoUnBoxing {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(new Integer(3));
		numbers.add(5);
		numbers.remove(1);              // remove index
		numbers.remove(new Integer(5)); // remove Object
		
		int num = numbers.get(0);
		
		System.out.println(numbers);
	}
}
