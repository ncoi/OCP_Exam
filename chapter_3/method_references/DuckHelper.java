package method_references;

import java.util.Comparator;

public class DuckHelper {
	public static int compareByWeight(Duck d1, Duck d2) {
		return d1.getWeight() - d2.getWeight();
	}
	
	public static int compareByName(Duck d1, Duck d2) {
		return d1.getName().compareTo(d2.getName());
	}
	
	public static void main(String[] args) {
		Comparator<Duck> c1 = DuckHelper::compareByWeight;
	}
}
