/**
 * 
 */
package seeba.task.RomanConverter.service;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Esmeralda
 *
 */
public class RomanConverterServiceTest {
	
	@Test
	public void toRomanNumberFormatTest() {
		
		RomanConverterServiceImpl rcs = new RomanConverterServiceImpl();
		String rcsTest = rcs.toRomanNumberFormat(1111);
		
		assertEquals("MCXI",rcsTest);
		
	}

}
