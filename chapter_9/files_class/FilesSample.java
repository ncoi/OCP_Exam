package files_class;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class FilesSample {

	public static void main(String[] args) {
		Path path1 = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\test.txt");
		Path path2 = Paths.get("../Java OCP/path/test.txt");
		
		// exists()
		System.out.println("Exists ?:"+Files.exists(path1));
		
		// isSameFile()
		try {
			System.out.println("isSame ?: "+Files.isSameFile(path1, path2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// createDirectories() createDirectory()
		Path path3 = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\new_directory");
		Path path4 = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\new\\directories\\malparido");
		
		try {
			Files.createDirectory(path3);
			Files.createDirectories(path4);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// copy()
		Path path5 = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\new\\directories\\test2.txt");
		Path path6 = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\new\\directories\\test_dir");
		try {
			Files.copy(path1, path5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// readAllLines
		List<String> lines;
		try {
			lines = Files.readAllLines(path1);
			for(String line : lines) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
