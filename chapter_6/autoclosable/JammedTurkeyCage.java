package autoclosable;

public class JammedTurkeyCage implements AutoCloseable {

//	public static void main(String[] args) {
//		try(JammedTurkeyCage t = new JammedTurkeyCage()) {
//			System.out.println("put turkeys in");
//			throw new IllegalStateException("turkeys ran off");
////			throw new RuntimeException("turkeys ran off");
//		} catch(IllegalStateException e) {
//			System.out.println("caught: " + e.getMessage());
//			for(Throwable t: e.getSuppressed()) {
//				System.out.println(t.getMessage());
//			}
//		}
//	}
	
	public static void main(String[] args) {
//		try(JammedTurkeyCage t1 = new JammedTurkeyCage(); JammedTurkeyCage t2 = new JammedTurkeyCage()) {
//			System.out.println("put turkeys in");
//		} catch(IllegalStateException e) {
//			System.out.println("caught: " + e.getMessage());
//			for(Throwable t: e.getSuppressed()) {
//				System.out.println(t.getMessage());
//			}
//		}
		
		try(JammedTurkeyCage t1 = new JammedTurkeyCage()) {
			throw new IllegalStateException("turkeys ran off");
		} finally {
			throw new RuntimeException("and we couldn't find them");
		}
	}

	@Override
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close");
	}

}
