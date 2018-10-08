package files_class;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesCopyPath {

	public static void main(String[] args) {
		Path path1 = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\copy\\test.txt");
		Path path2 = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\copy\\img.png");
		try {
			Files.copy(path1, path2);
			System.out.println(Files.isSameFile(path1, path2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
