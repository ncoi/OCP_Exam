package nested_classes;

public class MemberInnerClass {
	private String name = "Nelson";
	private void privateMethod() {
		System.out.println("I have access to the private method!");
	}
	
	
	private abstract interface Greet {
		public abstract void sayHi();
	}
	
	/* Member inner class can be abstract */
	abstract class InnerAbstract {
		abstract void done();
	}
	
	/* Can be public, private, protected or default access */
	public final class InnerClass implements Greet {
//		static int number = 5;          can't have static variables or methods
		private String name = "Camilo";
		public void sayHi() {
			System.out.println("Greetings! " + MemberInnerClass.this.name);
			privateMethod();
		}
	}
	
	public static void main(String [] args) {
		InnerClass ic = new MemberInnerClass().new InnerClass();
		ic.sayHi();
		
		MemberInnerClass mic = new MemberInnerClass();
		String n = mic.name;
	}
}
