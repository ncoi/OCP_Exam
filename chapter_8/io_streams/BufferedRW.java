package io_streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedRW {
	public static List<String> readFile(File source) throws FileNotFoundException, IOException {
		List<String> data = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new FileReader(source))) {
			String s;
			while((s = reader.readLine()) != null) {
				data.add(s);
			}
		}
		return data;
	}
	
	public static void writeFile(List<String> data, File destination) throws IOException {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
			for(String s : data) {
				writer.write(s);
				writer.newLine();
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File source = new File("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\file\\source.txt");
		File destination = new File("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\file\\destination.txt");
		List<String> data = readFile(source);
		for(String record : data) {
			System.out.println(record);
		}
		writeFile(data, destination);
	}

}
