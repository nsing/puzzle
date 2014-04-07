package solution;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ConverterTest {
	
	Converter converter;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		converter = ConverterFactory.getConverter();
	}

	@Test
	public void coreLogicTest() throws ConverterException {
		assertEquals("zero", converter.convert(0));
		assertEquals("one", converter.convert(1));
		assertEquals("two", converter.convert(2));
		assertEquals("three", converter.convert(3));
		assertEquals("four", converter.convert(4));
		assertEquals("five", converter.convert(5));
		assertEquals("six", converter.convert(6));
		assertEquals("seven", converter.convert(7));
		assertEquals("eight", converter.convert(8));
		assertEquals("nine", converter.convert(9));
		assertEquals("ten", converter.convert(10));
		assertEquals("eleven", converter.convert(11));
		assertEquals("twelve", converter.convert(12));
		assertEquals("thirteen", converter.convert(13));
		assertEquals("fourteen", converter.convert(14));
		assertEquals("fifteen", converter.convert(15));
		assertEquals("sixteen", converter.convert(16));
		assertEquals("seventeen", converter.convert(17));
		assertEquals("eighteen", converter.convert(18));
		assertEquals("nineteen", converter.convert(19));
		assertEquals("twenty", converter.convert(20));
		assertEquals("twenty one", converter.convert(21));
		assertEquals("thirty", converter.convert(30));
		assertEquals("forty", converter.convert(40));
		assertEquals("fifty", converter.convert(50));
		assertEquals("sixty", converter.convert(60));
		assertEquals("seventy", converter.convert(70));
		assertEquals("eighty", converter.convert(80));
		assertEquals("ninety", converter.convert(90));
		assertEquals("ninety nine", converter.convert(99));
		assertEquals("one hundred", converter.convert(100));
		assertEquals("one hundred and one", converter.convert(101));
		assertEquals("nine hundred and ninety nine", converter.convert(999));
		assertEquals("one thousand", converter.convert(1000));
		assertEquals("one thousand one", converter.convert(1001));
		assertEquals("nine thousand nine hundred and ninety nine", converter.convert(9999));
		assertEquals("ten thousand", converter.convert(10000));
		assertEquals("ten thousand one", converter.convert(10001));
		assertEquals("ninety nine thousand nine hundred and ninety nine", converter.convert(99999));
		assertEquals("one hundred thousand", converter.convert(100000));
		assertEquals("one hundred thousand one", converter.convert(100001));
		assertEquals("nine hundred and ninety nine thousand nine hundred and ninety nine", converter.convert(999999));
		assertEquals("one million", converter.convert(1000000));
		assertEquals("one million one", converter.convert(1000001));
		assertEquals("nine million nine hundred and ninety nine thousand nine hundred and ninety nine", converter.convert(9999999));
		assertEquals("ten million", converter.convert(10000000));
		assertEquals("ten million one", converter.convert(10000001));
		assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one",converter.convert(56945781));
		assertEquals("ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine", converter.convert(99999999));
		assertEquals("one hundred million", converter.convert(100000000));
		assertEquals("one hundred million one", converter.convert(100000001));
		assertEquals("nine hundred and ninety nine million nine hundred and ninety nine thousand nine hundred and ninety nine", converter.convert(999999999));
	}
	
	@Test (expected=ConverterException.class) 
	public void testMoreThanMaxSupported() throws ConverterException{
		converter.convert(1000000000);
	}
	
	@Test (expected=ConverterException.class) 
	public void testLessThanMinSupported() throws ConverterException{
		converter.convert(-1);
	}
	
	@Test (expected=ConverterException.class) 
	public void testInvalidNumber() throws ConverterException{
		converter.convert("sdfsdf");
	}

}
