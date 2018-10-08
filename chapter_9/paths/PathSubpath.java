package paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathSubpath {
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\test.txt");
		Path path2 = Paths.get("pw.log");
		
//		System.out.println(path2.);
		
		System.out.println("Subpath from 0 to 3 is: "+path.subpath(0,8));
		System.out.println("Subpath from 1 to 3 is: "+path.subpath(1,3));
		System.out.println("Subpath from 1 to 2 is: "+path.subpath(1,2));
	}
}
