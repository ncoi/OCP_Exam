package io_streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIOStream {
	transient int test;
	
	public static void copy(File source, File destination) throws IOException {
		try (InputStream is = new FileInputStream(source);
			OutputStream os = new FileOutputStream(destination)) {
			int b;
			while((b = is.read()) != -1) {
				os.write(b);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		File source = new File("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\file\\source.txt");
		File destination = new File("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\file\\destination.txt");
		copy(source, destination);
	}
}
