package converterapp;

public class Converter {
	
	private Reader reader;
	private Writer writer;
	private Transform transform;
	
	public Converter(Reader reader,Writer writer,Transform transform) {
		this.reader = reader;
		this.writer = writer;
		this.transform = transform;
	}
	
	public void convert() {
		
		String stringfile = reader.reader();
		
		String stringfileOut = transform.transform(stringfile);
		stringfileOut = transform.getHeader() + stringfileOut + transform.getFooter();
		
		writer.writer(stringfileOut);
		
	}

}
