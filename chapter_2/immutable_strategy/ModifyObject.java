package immutable_strategy;

import java.util.ArrayList;
import java.util.Arrays;

public class ModifyObject {
	public static void main(String[] args) {
		Animal a = new Animal("Dolphin", 23, new ArrayList<String>(
				Arrays.asList("Hamburger", "Pizza", "Hotdog")
			));
		
		Animal b = new Animal(a.getSpecies(), a.getAge() + 1, a.getFavoriteFoddList());
		
		System.out.println("A Age: " + a.getAge());
		System.out.println("B Age: " + b.getAge());
	}
}
