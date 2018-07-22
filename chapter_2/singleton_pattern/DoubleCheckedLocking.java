package singleton_pattern;

public class DoubleCheckedLocking {
	private static volatile DoubleCheckedLocking instance;
	
	public static DoubleCheckedLocking getInstance() {
		if(instance == null) {
			synchronized(DoubleCheckedLocking.class) {
				instance = new DoubleCheckedLocking();
			}
		}
		return instance;
	}
}
