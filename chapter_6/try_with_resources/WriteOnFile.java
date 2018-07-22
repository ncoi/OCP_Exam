package try_with_resources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteOnFile {
	public static void main(String[] args) {
		Path path1 = FileSystems.getDefault().getPath("/Users/norduz/Desktop","in.txt");
		Path path2 = FileSystems.getDefault().getPath("/Users/norduz/Desktop","out.txt");
		newApproach(path1, path2);
	}
	
	public static void newApproach(Path path1, Path path2) {
		try(BufferedReader in = Files.newBufferedReader(path1); BufferedWriter out = Files.newBufferedWriter(path2)) {
			out.write(in.readLine());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
