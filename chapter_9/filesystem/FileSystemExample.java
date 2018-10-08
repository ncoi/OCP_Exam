package filesystem;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemExample {

	public static void main(String[] args) throws URISyntaxException {
		Path path1 = FileSystems.getDefault().getPath("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\test.txt");
		
		// Connect to remote file system
		FileSystem fs = FileSystems.getFileSystem(new URI("http://www.selikoff.net"));
		Path path2 = fs.getPath("duck.txt");

	}

}
