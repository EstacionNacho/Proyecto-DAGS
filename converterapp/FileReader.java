package converterapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader implements Reader{
	
	private File file;
	
	public FileReader(File file) {
		this.file = file;
	}
	
	public String reader() {
		
		Scanner scanner = null;
		String toRet = "";
		
		try {
			scanner = new Scanner(file);

		} catch (FileNotFoundException e) {
			System.err.println("the file " + file.getAbsolutePath()
					+ " does not exists: " + e.getMessage());
			System.exit(1);
		}
		
		while (scanner.hasNextLine()) {			
			toRet = toRet + scanner.nextLine() + "\n";
		}
		
		return toRet;
	}

}
