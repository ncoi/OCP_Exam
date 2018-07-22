package autoclosable;

public class TurkeyCage implements AutoCloseable {

	public static void main(String[] args) {
		try(TurkeyCage t = new TurkeyCage()) {
			System.out.println("put turkeys in");
		}
	}

	@Override
	public void close() {
		System.out.println("Close gate");
	}

}
