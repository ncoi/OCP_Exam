package nested_classes;

public class LocalInner {
	private int length = 5;
	
	public void calculate() {
		int width = 5;
		class Inner {
			public void multiply() {
				System.out.println(length * width);
			}
		}
		Inner inner = new Inner();
		inner.multiply();
	}
	
	public static void main(String[] args) {
		LocalInner li = new LocalInner();
		li.calculate();
	}

}
