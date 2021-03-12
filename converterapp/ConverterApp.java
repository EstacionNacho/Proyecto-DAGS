package converterapp;

import java.io.File;


public class ConverterApp {

	public static void main(String args[]) {
		
		File input = FilesUI.getInputFile();
		File output = FilesUI.getOutputFile();
		
		Reader filereader = new FileReader(input);
		Writer filewriter = new FileWriter(output);
		Transform transform = new TABtoXML();
		
		Converter converter = new Converter(filereader,filewriter,transform);
		
		converter.convert();
	}

}
