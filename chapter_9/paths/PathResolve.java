package paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathResolve {

	public static void main(String[] args) {
		Path path1 = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\test.txt");
		Path path2 = Paths.get("pw.log");
		System.out.println(path1.resolve(path2));
		// C:\Users\nelso\Documents\Nelson\Cursos\Java OCP\path\test.txt\pw.log
		
		Path path3 = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\OCP_Exam\\pw.log");
		System.out.println(path1.resolve(path3));
		// C:\Users\nelso\Documents\Nelson\Cursos\OCP_Exam\pw.log
		
		Path path4 = Paths.get("../../../../../test.txt");
		System.out.println(path1.resolve(path4));
		// C:\Users\nelso\Documents\Nelson\Cursos\Java OCP\path\test.txt\..\..\..\..\..\test.txt
		// normalized: C:\Users\nelso\Documents\test.txt
		
		System.out.println(path4.resolve(path1));
		// C:\Users\nelso\Documents\Nelson\Cursos\Java OCP\path\test.txt
		
		System.out.println(path2.resolve(path4));
		// pw.log\..\..\..\..\..\test.txt
	}

}
