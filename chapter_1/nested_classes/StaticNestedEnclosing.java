package nested_classes;

public class StaticNestedEnclosing {
	int numero = 7;
	static int number = 6;
	static class Nested {
		private int price = 6;
		void sayNumber() {
			StaticNestedEnclosing ss = new StaticNestedEnclosing();
			System.out.println(ss.numero);
		}
	}
	public static void main(String []args) {
		Nested nested = new Nested();
		nested.sayNumber();
		System.out.println(nested.price);
	}
}
