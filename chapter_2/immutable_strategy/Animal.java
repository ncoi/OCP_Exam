package immutable_strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Animal {
	private final String species;
	private final int age;
	private final List<String> favoriteFoods;
	
	public Animal(String species, int age, List<String> favoriteFoods) {
		this.species = species;
		this.age = age;
		if(favoriteFoods == null) {
			throw new RuntimeException("favoriteFoods is required!");
		}
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}
	
	public String getSpecies() {
		return species;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getFavoriteFoodCount() {
		return favoriteFoods.size();
	}
	
	public String getFavoriteFood(int index) {
		return favoriteFoods.get(index);
	}
	
	public List<String> getFavoriteFoddList() {
		return Collections.unmodifiableList(favoriteFoods);
	}
	

	public static void main(String[] args) {
		List<String> list = new ArrayList(Arrays.asList("Hamburger", "Pizza", "Hotdog"));
//		Animal a = new Animal("Dolphin", 23, new ArrayList<String>(
//				Arrays.asList("Hamburger", "Pizza", "Hotdog")
//			));
//		Animal a = new Animal("Dolphin", 23, new ArrayList<String>() {{
//			add("Hamburger");
//			add("Pizza");
//			add("Hotdog");
//		}});
		Animal a = new Animal("Dolphin", 23, list);
		
		System.out.println("Age: " + a.getAge());
		System.out.println("Species: " + a.getSpecies());
		System.out.println("Favorite Food Count: "  +a.getFavoriteFoodCount());
		System.out.println("Favorite Food: " + a.getFavoriteFood(1));		
		
		list.remove(1);
		System.out.println("Favorite Food Count: "  +a.getFavoriteFoodCount());
		System.out.println("Favorite Food: " + a.getFavoriteFood(1));	
	}

}
