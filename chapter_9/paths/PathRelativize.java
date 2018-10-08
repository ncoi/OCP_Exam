package paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathRelativize {

	public static void main(String[] args) {
		Path path1 = Paths.get("chapter_9/paths/PathRelativize.java");
		Path path2 = Paths.get("pw.log");
		Path path6 = Paths.get("animal.data");

		System.out.println(path2.relativize(path6));
	
		System.out.println(path1.relativize(path2)); // ..\..\..\pw.log
		System.out.println(path2.relativize(path1)); // ..\chapter_9\paths\PathRelativize.java

		Path path3 = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\test.txt");
		Path path4 = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\OCP_Exam\\pw.log");

		System.out.println(path3.relativize(path4)); // ..\..\..\OCP_Exam\pw.log
		System.out.println(path4.relativize(path3)); // ..\..\Java OCP\path\test.txt

		Path path7 = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\OCP_Exam\\animal.data");
		Path path8 = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\OCP_Exam\\pw.log");

		System.out.println(path7.relativize(path8));
	}

}
