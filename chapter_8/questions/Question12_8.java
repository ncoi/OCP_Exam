package questions;

import java.io.File;

public class Question12_8 {
	public static void main(String[] args) {
//		File file = new File("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\file\\source.txt");
//		File file = new File("C://Users//nelso//Documents//Nelson//Cursos//Java OCP//file//source.txt");
		File file = new File("C:/Users/nelso/Documents/Nelson/Cursos/Java OCP/file/source.txt");
//		File file = new File("C:\Users\nelso\Documents\Nelson\Cursos\Java OCP\file\source.txt"); // DOESNT WORK
	
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isFile());
	}
}
