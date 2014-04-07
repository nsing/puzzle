package solution;

/**
 * Converter interface
 */
public interface Converter {
	/**
	 * Converts an integer between 0 to 999999999 into words
	 * 
	 * @param number
	 * @return
	 * @throws ConverterException
	 */
	String convert(int number) throws ConverterException;
	
	/**
	 * Converts an string containing integer between 0 to 999999999 into words
	 * 
	 * @param number
	 * @return
	 * @throws ConverterException
	 */
	String convert(String number) throws ConverterException;

}
