package paths_class;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsClass {

	public static void main(String[] args) throws URISyntaxException {
		Path path1 = Paths.get("/dir/file");
		Path path2 = Paths.get("/", "dir", "file");
		Path path3 = Paths.get(new URI("file:///root/dir"));
		Path path4 = Paths.get(new URI("https://www.google.com"));
		Path path5 = Paths.get(
				new URI("ftp://username:password@ftp.the-ftp-server.com"));
		URI uri4 = path4.toUri();
		
		System.out.println("URI isAbsolute(): " + new URI("file:///root/dir").isAbsolute());
		System.out.println("Path 1: " + path1);
		System.out.println("Path 2: " + path2);
	}

}
