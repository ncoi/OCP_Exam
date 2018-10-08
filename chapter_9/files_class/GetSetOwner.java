package files_class;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;

public class GetSetOwner {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\nelso\\Documents\\Nelson\\Cursos\\Java OCP\\path\\test.txt");
		try {
			// Read owner of file
			System.out.println(Files.getOwner(path).getName());
			
			// Change owner of file
			UserPrincipal up = FileSystems.getDefault().getUserPrincipalLookupService()
						.lookupPrincipalByName("nelso");
			Files.setOwner(path, up);
			
			// Output the updated owner information
			System.out.println(Files.getOwner(path).getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
