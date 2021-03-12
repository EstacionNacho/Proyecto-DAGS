package converterapp;


public interface Transform {
	
	public String getHeader();
	
	public String getFooter();
	
	public  String transform(String stringfile);

}
