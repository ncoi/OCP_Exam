package generic_interfaces;

interface Methods {
	public static void method() {
		
	}
}

public class StaticMethod implements Methods {
	public static void main(String[] args) {
		Methods m = new StaticMethod();
//		System.out.println(m.method());   // Static method can only be accesed as Methods.method
	}
}
