package io_streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class SkipMethod {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\file\\test.txt";
		InputStream is = new BufferedInputStream(
							new FileInputStream(path));
		
		System.out.println((char)is.read());
		System.out.println(is.skip(24));
		System.out.println((char)is.read());
		System.out.println((char)is.read());
	}

}
