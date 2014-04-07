package solution;

public class ConverterFactory {
	
	public static Converter getConverter() {
		return new ConverterImpl();
	}

}
