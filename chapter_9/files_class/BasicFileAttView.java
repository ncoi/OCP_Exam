package files_class;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttView {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path");
		
		BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		try {
			BasicFileAttributes bfa = view.readAttributes();
			System.out.println(bfa.lastModifiedTime());
			FileTime lastModifiedTime = FileTime.fromMillis(
					bfa.lastModifiedTime().toMillis() + 10_000);
			
			view.setTimes(lastModifiedTime, null, null);
			System.out.println(Integer.MAX_VALUE);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
