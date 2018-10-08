package files_class;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewBuffered {

	public static void main(String[] args) throws IOException {
		Path source = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\new_buffer\\reader\\test.txt");
		Path output = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\new_buffer\\writer\\output.txt");
		
		try(BufferedReader reader = Files.newBufferedReader(source, Charset.forName("US-ASCII"))) {
			// Read stream
			String currentLine = null;
			while((currentLine = reader.readLine()) != null) {
				System.out.println(currentLine);
			}
		}
		
		try(BufferedWriter writer = Files.newBufferedWriter(output, Charset.forName("UTF-16"))) {
			writer.write("Hello World");
		}
	}

}
