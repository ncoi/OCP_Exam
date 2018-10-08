package io_streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedIOStream {
	public static void copy(File source, File destination) throws FileNotFoundException, IOException {
		try (InputStream is = new BufferedInputStream(new FileInputStream(source));
			OutputStream os = new BufferedOutputStream(new FileOutputStream(destination));) {
			
			byte[] buffer = new byte[1024];
			int lengthRead;
			while((lengthRead = is.read(buffer)) > 0) {
				System.out.println("Read: " + lengthRead + " bytes");
				os.write(buffer, 0, lengthRead);
				os.flush();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		File source = new File("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\file\\source.txt");
		File destination = new File("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\file\\destination.txt");
		copy(source, destination);
	}
}
