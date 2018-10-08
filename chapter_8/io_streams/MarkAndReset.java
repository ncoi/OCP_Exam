package io_streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MarkAndReset {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\file\\test.txt";
		InputStream is = new BufferedInputStream(
							new FileInputStream(path));
		
		if(is.markSupported()) {
			is.mark(1);
			System.out.println((char)is.read());
			System.out.println((char)is.read());
			System.out.println((char)is.read());
			is.reset();
		}
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		
	}

}
