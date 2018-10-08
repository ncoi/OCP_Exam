package paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathNames {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\test.txt");

		System.out.println("The Path Name is: " + path);
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println(" Element " + i + " is: " + path.getName(i));
		}

		// getFileName(), getParent(), and getRoot()
		System.out.println("Filename is: " + path.getFileName());
		System.out.println("Root is: " + path.getRoot());
		Path currentParent = path;
		while ((currentParent = currentParent.getParent()) != null) {
			System.out.println(" Current parent is: " + currentParent);
		}
	}

}
