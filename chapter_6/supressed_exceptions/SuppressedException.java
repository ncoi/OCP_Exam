package supressed_exceptions;

import autoclosable.JammedTurkeyCage;

public class SuppressedException {

	public static void main(String[] args) {
		try(JammedTurkeyCage tc = new JammedTurkeyCage();) {
			throw new IllegalStateException("Illegal state");
		} catch(IllegalStateException e) {
			System.out.println(e.getMessage());
			for(Throwable t : e.getSuppressed()) {
				System.out.println(t.getMessage());
			}
		}
	}

}
