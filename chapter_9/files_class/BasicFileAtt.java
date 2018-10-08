package files_class;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAtt {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path");
		
		try {
			BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);
			System.out.println("Is path a directory? "+data.isDirectory());
			System.out.println("Is path a regular file? "+data.isRegularFile());
			System.out.println("Is path a symbolic link? "+data.isSymbolicLink());
			System.out.println("Path not a file, directory, nor symbolic link? "+
			data.isOther());
			System.out.println("Size (in bytes): "+data.size());
			System.out.println("Creation date/time: "+data.creationTime());
			System.out.println("Last modified date/time: "+data.lastModifiedTime());
			System.out.println("Last accessed date/time: "+data.lastAccessTime());
			System.out.println("Unique file identifier (if available): "+
			data.fileKey());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
