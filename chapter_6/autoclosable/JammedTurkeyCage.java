package autoclosable;

public class JammedTurkeyCage implements AutoCloseable {

	@Override
	public void close() throws RuntimeException {
		throw new RuntimeException("closing exception");
	}
	
	public static void main(String[] args) {
		try(JammedTurkeyCage jtc = new JammedTurkeyCage();) {
			// stuff...
		} catch(Exception e) {
			
		}
	}


}
