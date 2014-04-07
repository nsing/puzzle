package solution;

public class ConverterClient {
	
	public static void main(String[] args) throws ConverterException {
		Converter converter = ConverterFactory.getConverter();
		System.out.println("input: "+args[0]+" output:" + converter.convert(args[0]));
	}

}
