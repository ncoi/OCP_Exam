package questions;

import java.util.Optional;
import java.util.OptionalLong;

public class Question9 {

	public static void main(String[] args) {
		OptionalLong l = OptionalLong.of(2);
		Optional o = Optional.of(2);
		System.out.println(l.getAsLong());
	}

}
