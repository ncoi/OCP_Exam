package questions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Question_16_9 {

	public static void main(String[] args) {
		Path path1 = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\test.txt");
		
		try {
			Stream<Stream<String>> s1 = Files.lines(path1).map(p -> Stream.of("1","2","3"));
			Stream<String> s2 = Files.lines(path1).flatMap(p -> Stream.of("1","2","3"));
		} catch (IOException e) {
			// TODO Auto-generated catch blXjock
			e.printStackTrace();
		}
	}

}
