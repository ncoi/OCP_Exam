package exceptions_and_interfaces;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

public class ExceptionCaseStudy {
	private static List<String> create() throws IOException{
		throw new IOException();
	}
	
	private static List<String> createSafe() {
		try {
			return create();
		} catch(IOException e) {
			throw new RuntimeException();
		}
	}
	
	public static void main(String[] args) {
		createSafe().stream().count();
		Supplier<List<String>> sup = ExceptionCaseStudy::createSafe;
	}

}
