package io_streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class HighLevelStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path = "C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\file\\test.txt";
		try(BufferedReader bufferedReader = new BufferedReader(
											new FileReader(path))) {
			System.out.println(bufferedReader.readLine());
		}
		InputStreamReader r = null; // extends Reader
		OutputStreamWriter w = null; // extends Writer
		PrintStream ps = null; // extends OutputStream
		PrintWriter pw = null; // extends Writer
	}

}
