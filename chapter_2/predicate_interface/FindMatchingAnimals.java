package predicate_interface;

import java.util.function.Predicate;

public class FindMatchingAnimals {
	private static void print(Animal animal, Predicate<Animal> trait) {
		if(trait.test(animal)) {
			System.out.println(animal);
		}
	}
	public static void main(String[] args) {
		print(new Animal("fish", false, true), a -> a.canSwim());
		print(new Animal("kangaroo", true, false), a -> a.canHop());
	}
}
