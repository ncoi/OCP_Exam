package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Question7 {
	private static List<String> sort(List<String> list) {
		List<String> copy = new ArrayList<>(list);
		Collections.sort(copy, (a, b) -> b.compareTo(a));
		return copy;
	}
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Carolina","Xinia","Abby","Diego");
		System.out.println(sort(list));
		
		List<String> list2 = list.stream()
			.sorted((a,b) -> b.compareTo(a))
			.collect(Collectors.toList());
		
		System.out.println(list2);
	}

}
