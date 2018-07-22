package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonCollections {

	public static void main(String[] args) {
		// add()
		List<String> list1 = new ArrayList<>();
		System.out.println("List Add Sparrow: " + list1.add("Sparrow"));
		System.out.println("List Add Sparrow: " + list1.add("Sparrow"));
		
		Set<String> set1 = new HashSet<>();
		System.out.println("Set Add Sparrow: " + set1.add("Sparrow"));
		System.out.println("Set Add Sparrow: " + set1.add("Sparrow"));
		
		
		// remove()
		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		System.out.println("List remove cardinal: " + birds.remove("cardinal"));
		System.out.println("List remove cardinal: " + birds.remove("hawk"));
		System.out.println(birds);
		
		
		// isEmpty() and size()
		List<String> birds1 = new ArrayList<>();
		System.out.println("Birds is Empty?: " + birds1.isEmpty());
		System.out.println("Birds size " + birds1.size());
		birds1.add("hawk");
		birds1.add("hawk");
		System.out.println("Birds is Empty?: " + birds1.isEmpty());
		System.out.println("Birds size " + birds1.size());
		
		
		// clear()
		List<String> birds2 = new ArrayList<>();
		birds2.add("hawk");
		birds2.add("hawk");
		System.out.println(birds2);
		birds2.clear();
		System.out.println(birds2);
		
		// contains()
		List<String> birds3 = new ArrayList<>();
		birds3.add("hawk");
		System.out.println("Contains hawk: " + birds3.contains("hawk"));
		System.out.println("Contains robin: " + birds3.contains("robin"));
	}

}
