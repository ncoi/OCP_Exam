package assertions;

public class AssertionsClass {

	public static void main(String[] args) {
		int numGuests = -5;
		assert numGuests > 0 : "Cagaste: " + numGuests;
		System.out.println(numGuests);
	}

}
