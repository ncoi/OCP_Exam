package functional_interface;

@FunctionalInterface
public interface CheckTrait {
	public boolean test(Animal a, int b);
	
//  Interfaces can only be public
//	public default void hola() {
//		
//	}
}
