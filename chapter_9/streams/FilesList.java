package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import io_streams.SystemOut;

public class FilesList {

	public static void main(String[] args) {
		Path path = Paths.get("./chapter_9/files_class");
		try {
			Files.list(path)
				.filter(p -> !Files.isDirectory(p))
				.map(p -> p.toAbsolutePath())
				.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
