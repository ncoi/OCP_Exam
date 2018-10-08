package search_and_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortRabbits {
	
	static class Rabbit { int id;}
	public static void main(String[] args) {
		List<Rabbit> rabbits = new ArrayList<>();
		rabbits.add(new Rabbit());
		Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
		Collections.sort(rabbits, c);
		
		List<String> names = Arrays.asList("Fluffy", "Bugs", "Hoppy");
		Comparator<String> c1 = Comparator.reverseOrder();
		Collections.sort(names);
		int index = Collections.binarySearch(names, "Carlos");
		System.out.println(index);
		
		Set<Rabbit> set = new TreeSet<>(new Comparator<Rabbit>() {
			public int compare(Rabbit r1, Rabbit r2) {
				return r1.id - r2.id;
			}
		});
		set.add(new Rabbit());
	}

}
