package file_class;

import java.io.File;

public class FileClass {

	public static void main(String[] args) {
		System.out.println(System.getProperty("file.separator"));
		System.out.println(java.io.File.separator);
		
		File file = new File("/home/smith/data/zoo.txt");
		System.out.println(file.exists());
	}

}
