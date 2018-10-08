package file_class;

import java.io.File;

public class FileSample {

	public static void main(String[] args) {
		File parent = new File("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP");
		File file = new File(parent, "file\\hola");

		System.out.println("File Exists: "+ file.isFile());
//		if (file.exists()) {
//			System.out.println("Absolute Path: " + file.getAbsolutePath());
//			System.out.println("Is Directory: " + file.isDirectory());
//			System.out.println("Parent Path: " + file.getParent());
//			if (file.isFile()) {
//				System.out.println("File size: " + file.length());
//				System.out.println("File LastModified: " + file.lastModified());
//			} else {
//				for (File subfile : file.listFiles()) {
//					System.out.println("\t" + subfile.getName());
//				}
//			}
//		}
		
	}

}
