package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesFind {

	public static void main(String[] args) {
		Path path = Paths.get("./chapter_9");
		long dateFilter = 1420070400000l;
		
		try {
			Stream<Path> stream = Files.find(path, 0, 
					(p, a) -> p.toString().endsWith(".java") && a.lastModifiedTime().toMillis() > dateFilter);
			stream.forEach(System.out::println);
//			Files.find(path, 1,
//					(p, a) -> {
//						System.out.println("Path: " + path.toAbsolutePath());
//						return false;
//					}).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
