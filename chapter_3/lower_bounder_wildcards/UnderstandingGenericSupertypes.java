package lower_bounder_wildcards;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UnderstandingGenericSupertypes {
	public static void main(String[] args) {
		// Puede ser: IOException, Exception u Object
		List<? super IOException> exceptions = new ArrayList<IOException>();
		
		exceptions.add(new IOException());
		// Exception e = new IOException();
		// IOException e = new IOException();
		
//		exceptions.add(new Object());
		// IOException e = new Object(); Doesn't COMPILE

		
//		exceptions.add(new Exception());
		// Exception e = new Exception();
		// IOException e = new Exception();  Doesn't COMPILE

		
		exceptions.add(new FileNotFoundException());
		
		// Exception e = new FileNotFoundException();
		// IOException e = FileNotFoundException();

	}
}
