package generic_classes;

public class Crate<T> {
	private T contents;
	public T emptyCrate() {
		return contents;
	}
	
	public static <V> V greet(V t) {
		return t;
	}
	
	public void packCrate(T contents) {
		this.contents = contents;
	}
}
