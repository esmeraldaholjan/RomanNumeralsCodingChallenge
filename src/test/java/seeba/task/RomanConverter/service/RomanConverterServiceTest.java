package seeba.task.RomanConverter.service;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * Tests for RomanConverterService
 * @author Esmeralda
 *
 */
public class RomanConverterServiceTest {
	
	@Test(expected=NullPointerException.class)
	public void toRomanNumberFormatTest() {
		
		RomanConverterServiceImpl rcs = new RomanConverterServiceImpl();
		
		// Test values
		String rcsTest1 = rcs.toRomanNumberFormat(-4);
		String rcsTest2 = rcs.toRomanNumberFormat(5004);
		String rcsTest3 = rcs.toRomanNumberFormat(156);
		String rcsTest4 = rcs.toRomanNumberFormat(1009);
		String rcsTest5 = rcs.toRomanNumberFormat(0);
		
		assertEquals("We are sorry but negative numbers don't have there own Roman numerals.",rcsTest1);
		assertEquals("We are sorry but we are not able to convert number bigger than 4999.",rcsTest2);
		assertEquals("CLVI",rcsTest3);
		assertEquals("MIX",rcsTest4);
		assertEquals("We are sorry but zero number doesn't have its own Roman numeral.",rcsTest5);
	}

}
