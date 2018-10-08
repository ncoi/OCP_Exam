package paths;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathSample {

	public static void main(String[] args) throws URISyntaxException {
		Path path1 = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path");
		Path path2 = Paths.get("C:","Users","nelso","Documents","Nelson","Cursos","Java OCP","path");
		Path path3 = Paths.get(new URI("file:/C:/Users/nelso/Documents/Nelson/Cursos/Java%20OCP/path/test.txt"));
		
		
		System.out.println(path3.toAbsolutePath());
		
//		File file = new File("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\test.txt");
//		System.out.println(file.toURI());
	}

}
