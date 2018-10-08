package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesLines {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\test.txt");
		
		try {
			Files.lines(path).forEach(System.out::println);
		} catch (IOException e) {
			// Handle file I/O exception...
		}
	}

}
