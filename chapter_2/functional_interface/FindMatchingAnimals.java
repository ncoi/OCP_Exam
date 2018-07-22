package functional_interface;

public class FindMatchingAnimals {
	private static void print(Animal animal, CheckTrait trait) {
		if(trait.test(animal, 1)) {
			System.out.println(animal);
		}
	}
	public static void main(String[] args) {
		print(new Animal("fish", false, true), (a, b) -> a.canSwim());
		print(new Animal("kangaroo", true, false), (a, b) -> a.canHop());
	}
}
