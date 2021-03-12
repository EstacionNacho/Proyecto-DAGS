package converterapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileWriter implements Writer{
	
	private File file;
	
	public FileWriter(File file){
		
		this.file = file;
	}
	
	public void writer(String stringfile) {
		
		PrintStream out = null;
		
		try {
			out = new PrintStream(new FileOutputStream(file));
		} catch (FileNotFoundException e1) {
			System.err.println("the file " + file.getAbsolutePath()
					+ " does cannot be created: " + e1.getMessage());
			System.exit(1);
		}
		
		out.println(stringfile);
		
		out.close();
	}

}
