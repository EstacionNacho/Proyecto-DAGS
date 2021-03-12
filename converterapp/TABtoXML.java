package converterapp;

public class TABtoXML implements Transform {
	
	public String getHeader() {
		return "<products>";
	}
	
	public String getFooter() {
		return "</products>";
	}

	public String transform(String stringfile) {
		
		String[] lines = stringfile.split("\n");
		
		String toRet = "";
		
		for(int i = 0; i<lines.length; i++) {
			
			String[] tokens = lines[i].toString().split("\t");
			
			if (tokens.length != 2) {
				throw new IllegalArgumentException(
					"the line does not contain 3 tokens");
			}
			
			toRet = toRet +"<product>\n\t<name>" + tokens[0] + "</name>\n\t<price>"
					+ tokens[1] + "</price>\n</product>";
		
		}

		return toRet;

	
	}
}
