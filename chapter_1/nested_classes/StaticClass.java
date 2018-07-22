package nested_classes;

public class StaticClass {
	
	public static class StaticNested extends Outer {
		private int price = 6;
	}
	
	public static void main(String [] args) {
		StaticNested sn = new StaticNested();
		System.out.println(sn.price);
	}
}
