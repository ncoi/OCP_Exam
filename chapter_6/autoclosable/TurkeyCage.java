package autoclosable;

public class TurkeyCage implements AutoCloseable {

	public static void main(String[] args) {
		try(TurkeyCage tc = new TurkeyCage();) {
			// stuff...
		}
	}

	@Override
	public void close() {
		System.out.println("closing!");
	}

}
