package supressed_exceptions;

import autoclosable.JammedTurkeyCage;

public class FinallyException {

	public static void main(String[] args) {
		try(JammedTurkeyCage tc = new JammedTurkeyCage();) {
			throw new IllegalStateException("turkets ran off...");
		} finally {
			throw new RuntimeException("and we couldn't find them");
		}
	}

}
