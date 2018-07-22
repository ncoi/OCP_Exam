package singleton_pattern;

public class LazyInstantiation {
	private static LazyInstantiation instance;
	
	private LazyInstantiation() {}
	
	public synchronized static LazyInstantiation getIntance() { // with synchronized now is thread-safe
		if(instance == null) {
			System.out.println("Creating a new Instance!");
			return instance = new LazyInstantiation();   // NOT THREAD-SAFE
		}
		System.out.println("Returning existing Instance...");
		return instance;
	}
	
	public static void main(String[] args) {
		LazyInstantiation lz1 = LazyInstantiation.getIntance();
		LazyInstantiation lz2 = LazyInstantiation.getIntance();
	}
}
