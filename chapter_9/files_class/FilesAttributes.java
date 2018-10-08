package files_class;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class FilesAttributes {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\test.txt");
		Path path2 = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path");
		
		System.out.println("Directory? : "+Files.isDirectory(path));
		System.out.println("Regular ?: "+Files.isRegularFile(path));
		System.out.println("Symbolic Link? : "+Files.isSymbolicLink(path));
		try {
			System.out.println("Hidden ? : "+Files.isHidden(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Readable ? : "+Files.isReadable(path));
		System.out.println("Executable ? : "+Files.isExecutable(path));
		try {
			System.out.println("Size ? : "+Files.size(path));
			System.out.println("Size Dir ? : "+Files.size(path2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileTime ft = Files.getLastModifiedTime(path);
			System.out.println("Last Modified: "+ft.toMillis());
			Files.setLastModifiedTime(path, FileTime.fromMillis(System.currentTimeMillis()));
			ft = Files.getLastModifiedTime(path);
			System.out.println("Last Modified changed: "+ft.toMillis());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			UserPrincipal up = path.getFileSystem().getUserPrincipalLookupService()
					.lookupPrincipalByName("nelso");
			System.out.println(up);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
}
