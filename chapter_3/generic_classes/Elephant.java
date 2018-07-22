package generic_classes;

public class Elephant {
	public static void main(String[] args) {
		// single type parameter
		Elephant e = new Elephant();
		Crate<Elephant> crateForElephant = new Crate<>();
		crateForElephant.packCrate(e);
		Elephant inNewHome = crateForElephant.emptyCrate();
		System.out.println("Elephant new home: " + inNewHome);
		
		// multiple type parameter
		Elephant elephant = new Elephant();
		Integer limit = 15_000;
		SizeLimitedCrate<Elephant, Integer> slc = new SizeLimitedCrate<>(elephant, limit);
	}
}
