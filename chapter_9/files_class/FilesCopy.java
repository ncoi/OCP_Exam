package files_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesCopy {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File source = new File("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\copy_from\\input_stream.txt");
		File output = new File("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\copy_to\\os_copy.txt");
		
		try(InputStream is = new FileInputStream(source);
				OutputStream os = new FileOutputStream(output)) {
			// Copy stream to data file
			Files.copy(is, Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\copy_to\\is_copy.txt"));
			
			// Copy file data to stream
			Files.copy(Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\copy_from\\output_stream.txt"), os);
		}
	}

}
