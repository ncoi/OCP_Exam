package nested_classes;

public class LocalInnerClass {
	private int length = 5;
	public void calculate() {
		final int width = 10;
		class Inner {
			public void multiply() {
				System.out.println("Multiply: " + length * width);
			}
		}
		
		Inner i = new Inner();
		i.multiply();
	}
	
	
	
	public static Object myInnerMethod() {
		/* Can be abstract or final, but no access modifier */
		final class FinalClass {
			
		}
		
		abstract class Inner {
			abstract void innerMethod();
		}
		
		class Inner2 extends Inner {
			public void innerMethod() {
				System.out.println("Inner abstact method");
			}
		}
		
		Inner2 i = new Inner2();
		return i;
	}
	
	public static void main(String []args) {
		Object o = myInnerMethod();
		System.out.println(o);
		
		LocalInnerClass lic = new LocalInnerClass();
		lic.calculate();
	}
}
