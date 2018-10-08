package paths;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathToRealPath {

	public static void main(String[] args) {
		Path path = Paths.get("../../../test.txt");
		try {
			System.out.println(path.toRealPath()); // C:\Users\nelso\Documents\test.txt
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
