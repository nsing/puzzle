package solution;

/**
 * Converter implementation
 */
public class ConverterImpl implements Converter {
	private static final String SPACE = " "; //Constant for space
	private static final String AND = "and"; //Constant for and
	private static final String ZERO = "zero"; //Constant for zero
	private static final String HUNDRED = "hundred"; //Constant for hundred unit
	
	//Constant array having thousand and million units as elements
	private static final String[] UNITS = { "", "thousand", "million" };
	
	//Constant array having words for numbers 1 - 19 as elements
	private static final String[] NUMBERS = { "", "one", "two", "three",
			"four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
			"twelve", "thirteen", "fourteen", "fifteen", "sixteen",
			"seventeen", "eighteen", "nineteen" };
	
	//Constant array having words for 10, 20, 30, 40, 50, 60, 70, 80, 90 as elements
	private static final String[] NUMBERS10 = { "", "ten", "twenty", "thirty",
		"forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	/**
	 * Converts an string containing integer (0 to 999999999) into words
	 * 
	 * @param number
	 * @return
	 * @throws ConverterException
	 */
	public String convert(String strNumber) throws ConverterException{
		try {
			int number;
			number= Integer.parseInt(strNumber);
			return convert(number);
		}
		catch(NumberFormatException nfe) {
			throw new ConverterException("Not a valid integer value"); 
		}
	}

	/**
	 * Converts an integer (0 to 999999999) into words
	 * 
	 * @param number
	 * @return
	 * @throws ConverterException
	 */
	public String convert(int number) throws ConverterException{
		if (0 > number || 999999999 < number) { //Number is greater than 999999999
			throw new ConverterException("Value not supported. Values supported are 0 to 999999999");
		}
		String numbInWords = ""; //Initialise as empty string
		int count = 0;
		if (0 == number) { //Number is zero
			return ZERO; //Return word for zero
		}
		//Build the number in words
		// Extract hundreds from number
		// Convert hundreds into words
		//remaining number is greater than 0 
		while (number > 0) { //Number is greater than zero
			int hundreds = number % 1000; //Hundreds from number
			if (hundreds != 0) { //Hundred is not zero
				String unit = ""; //Units initialised as empty string 
				if (count != 0) {
					unit = SPACE + UNITS[count]; //Unit has some value 
				}	
				if (!numbInWords.equals("")) { //Number in words is not empty
					numbInWords = convertHundreds(hundreds) + unit + SPACE
							+ numbInWords;
				} else {
					numbInWords = convertHundreds(hundreds) + unit;
				}
			}
			count++; //Increment the counter
			number = (number - hundreds) / 1000; //Remove hundreds from the number
		}
		return numbInWords; //Return number in words
	}

	/**
	 * Converts an integer (1 to 999) into words
	 * 
	 * @param number
	 * @return
	 */
	private String convertHundreds(int number) {
		StringBuilder words = new StringBuilder(); //Initialise as empty string
		int reminder100 = number % 100; //Remainder after division by 100
		if (number > 99) { //Get hundred unit as number is greater than 99
			words.append(NUMBERS[number / 100]);//Append number having hundred unit 
			words.append(SPACE); //Append space
			words.append(HUNDRED); //Append string for hundred unit
			if (reminder100 != 0) { //Number is not divisible by 100 
				words.append(SPACE); //Append space
				words.append(AND); //Append string for and
				words.append(SPACE); //Append space
			}
		}
		if (reminder100 < 20) { //Remainder after division by 100 is LT 20 
			//Append word for the number part (one of 0 to 19) 
			words.append(NUMBERS[reminder100]); //For 0 empty string is used
		} 
		else { //Remainder after division by 100 is GT 20 
			//Append word for the number part (one of 20, 30, .. 90)
			words.append(NUMBERS10[number / 10 % 10]); 
			if (number % 10 > 0) { //Remainder after division by 10 is GT 0
				words.append(SPACE);
				//Append word for the number part (one of 1 to 9)
				words.append(NUMBERS[number % 10]);
			}
		}
		return words.toString(); //Return words for the number
	}
}
